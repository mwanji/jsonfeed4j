# jsonfeed4j

jsonfeed4j is a [JSON Feed](https://jsonfeed.org) reader and writer for Java 8+.

## Installation

Requires Java 1.8 or above.

Add the following dependency to your POM (or equivalent for other dependency managers):

```xml
<dependency>
  <groupId>com.moandjiezana.jsonfeed</groupId>
  <artifactId>jsonfeed4j-gson</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```

This binds jsonfeed4j to the Gson JSON library. If you wish to use another JSON library, you must implement your own `JsonFeedReader`.

## Quick Start

```java
JsonFeed jsonFeed = new GsonJsonFeedReader().read(getJsonFeedFile());
System.out.println("Author: " + jsonFeed.getAuthor().orElse(""));
jsonFeed.getItems().stream().map(Item::getUrl).forEach(System.out::println);
```

## Validation

jsonfeed4j uses standard [Bean Validation 1.1](http://beanvalidation.org) ([spec](http://beanvalidation.org/1.1/spec/)) annotations to enforce JSON Feed's required fields. However, no implementation is included, so validation can be performed with whichever implementation you prefer, such as Hibernate Validator. Custom validators are provided for cases in which there are several optional fields, but at least one must be present. Examples include `item.content_text` and `item.content_text`.

Optional fields are wrapped in an `Optional` to make it obvious.

```java
Validator validator = getValidator();
JsonFeed jsonFeed = getJsonFeed();

Set<ConstraintViolations<?>> violations = validator.validate(jsonFeed);
```

## Extensions

JSON Feed allows extensions at every level. All jsonfeed4j model classes have a `Extensions getExtensions()` method. From the `Extensions` object, you can retrieve the extension's root by its name without the underscore. For example:

```json
{
  "_plugin1": {
    "key": "value"
  },
  "_plugin2": [ "a", "b", "c"],
  "_plugin3": "value2",
  "items": [
    {
      "id": "http://example.org/1",
      "content_text": "Some text",
      "_plugin4": 1234
    }
  ]
}
```

```java
JsonFeed jsonFeed = getJsonFeed();
Extensions topLevelExtensions = jsonFeed.getExtensions();

Map<String, ?> plugin1 = topLevelExtensions.getMap("plugin1");
List<?> plugin2 = topLevelExtensions.getList("plugin2");
Object plugin3 = topLevelExtensions.get("value2");
Object plugin4 = jsonFeed.getItems().get(0).getExtensions().get("plugin4");
```
