package jsonfeed4j;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jsonfeed4j.testutils.GsonJsonFeedReader;

public class JsonFeedTest {

  @Test
  public void should_read_minimal_valid_feed_with_no_items() {
    JsonFeed jsonFeed = new GsonJsonFeedReader().read(this.getClass().getResourceAsStream("/topLevel/minimal.json"));
    
    assertEquals(Versions.VERSION_1, jsonFeed.getVersion());
    assertEquals("My Test Feed", jsonFeed.getTitle());
    assertTrue(jsonFeed.getItems().isEmpty(), "Items should be an empty collection");
  }
}
