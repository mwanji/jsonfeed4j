# jsonfeed4j

jsonfeed4j is a [JSON Feed](https://jsonfeed.org) reader and writer for Java 8+.

## Installation

Add the following dependency to your POM (or equivalent for other dependency managers):

```xml
<dependency>
  <groupId>com.moandjiezana.jsonfeed</groupId>
  <artifactId>jsonfeed4j-gson</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```

Requires Java 1.8 or above.

## Quick Start

```java
JsonFeed jsonFeed = new GsonJsonFeedReader().read(getJsonFeedFile());
jsonFeed.getAuthor();
jsonFeed.getItems().stream().map(Item::getUrl).forEach(System.out::println);
```


