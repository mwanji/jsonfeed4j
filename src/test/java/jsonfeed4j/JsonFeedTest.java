package jsonfeed4j;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;

import org.junit.jupiter.api.Test;

import jsonfeed4j.testutils.GsonJsonFeedReader;

public class JsonFeedTest {

  @Test
  public void should_read_minimal_valid_feed_with_no_items() {
    JsonFeed jsonFeed = feed("minimal");
    
    assertEquals(Versions.VERSION_1, jsonFeed.getVersion());
    assertEquals("My Test Feed", jsonFeed.getTitle());
    assertTrue(jsonFeed.getItems().isEmpty(), "Items should be an empty collection");
  }
  
  @Test
  public void should_get_home_page_url() throws Exception {
    JsonFeed jsonFeed = feed("basic");
    
    assertEquals("http://moandjiezana.com", jsonFeed.getHomePageUrl());
  }
  
  @Test
  public void should_get_feed_url() throws Exception {
    JsonFeed jsonFeed = feed("basic");
    
    assertEquals("http://moandjiezana.com/feed.json", jsonFeed.getFeedUrl());
  }
  
  @Test
  public void should_get_feed_description() throws Exception {
    JsonFeed jsonFeed = feed("basic");
    
    assertEquals("Some words about this feed", jsonFeed.getDescription());
  }
  
  @Test
  public void should_get_user_comment() throws Exception {
    JsonFeed jsonFeed = feed("basic");
    
    assertEquals("Here's what you can expect", jsonFeed.getUserComment());
  }
  
  @Test
  public void should_get_next_url() throws Exception {
    JsonFeed jsonFeed = feed("basic");
    
    assertEquals("http://moandjiezana.com/feed.json?page=2", jsonFeed.getNextUrl());
  }
  
  @Test
  public void should_get_icon() throws Exception {
    JsonFeed jsonFeed = feed("basic");
    
    assertEquals("http://moandjiezana.com/icon.jpg", jsonFeed.getIcon());
  }
  
  @Test
  public void should_get_favicon() throws Exception {
    JsonFeed jsonFeed = feed("basic");
    
    assertEquals("http://moandjiezana.com/favicon.jpg", jsonFeed.getFavicon());
  }
  
  @Test
  public void should_get_expired() throws Exception {
    JsonFeed jsonFeed = feed("basic_expired");
    
    assertTrue(jsonFeed.isExpired());
  }
  
  @Test
  public void should_get_not_expired() throws Exception {
    JsonFeed jsonFeed = feed("basic");
    
    assertFalse(jsonFeed.isExpired());
  }
  
  
  
  private JsonFeed feed(String feed) {
    return new GsonJsonFeedReader().read(this.getClass().getResourceAsStream("/topLevel/" + feed + ".json"));
  }
}
