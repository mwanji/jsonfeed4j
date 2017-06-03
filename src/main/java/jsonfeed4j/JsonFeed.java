package jsonfeed4j;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class JsonFeed {
  
  private Version version;
  private String title;
  private List<Item> items;
  private String homePageUrl;
  private String feedUrl;
  private String description;
  private String userComment;
  private String nextUrl;
  private String icon;
  private String favicon;
  private boolean expired;
  private Author author;
  private Map<String, Object> extensions = Collections.emptyMap();

  public Version getVersion() {
    return version;
  }

  public String getTitle() {
    return title;
  }

  public List<Item> getItems() {
    return items;
  }

  public Optional<String> getHomePageUrl() {
    return Optional.ofNullable(homePageUrl);
  }

  public Optional<String> getFeedUrl() {
    return Optional.ofNullable(feedUrl);
  }

  public Optional<String> getDescription() {
    return Optional.ofNullable(description);
  }

  public Optional<String> getUserComment() {
    return Optional.ofNullable(userComment);
  }

  public Optional<String> getNextUrl() {
    return Optional.ofNullable(nextUrl);
  }
  
  public Optional<String> getIcon() {
    return Optional.ofNullable(icon);
  }

  public Optional<String> getFavicon() {
    return Optional.ofNullable(favicon);
  }

  public boolean isExpired() {
    return expired;
  }
  
  public Optional<Author> getAuthor() {
    return Optional.ofNullable(author);
  }

  public Extensions getExtensions() {
    return new Extensions(extensions);
  }
}
