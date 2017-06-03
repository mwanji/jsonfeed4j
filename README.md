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
System.out.println("Author: " + jsonFeed.getAuthor());
jsonFeed.getItems().stream().map(Item::getUrl).forEach(System.out::println);
```

## Validation

jsonfeed4j uses standard [Bean Validation 1.1](http://beanvalidation.org) ([spec](http://beanvalidation.org/1.1/spec/)) annotations to enforce JSON Feed's required fields. However, no JSR 303 implementation is included, so validation can be performed with whichever implementation you prefer, such as Hibernate Validator.

```java
Validator validator = getValidator();
JsonFeed jsonFeed = getJsonFeed();

Set<ConstraintViolations<?>> violations = validator.validate(jsonFeed);
```
