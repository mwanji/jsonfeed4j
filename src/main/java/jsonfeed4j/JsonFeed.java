package jsonfeed4j;

import java.util.List;
import java.util.function.BooleanSupplier;

public class JsonFeed {
  
  private Versions version;
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

  public Versions getVersion() {
    return version;
  }

  public String getTitle() {
    return title;
  }

  public List<Item> getItems() {
    return items;
  }

  public String getHomePageUrl() {
    return homePageUrl;
  }

  public String getFeedUrl() {
    return feedUrl;
  }

  public String getDescription() {
    return description;
  }

  public String getUserComment() {
    return userComment;
  }

  public String getNextUrl() {
    return nextUrl;
  }
  
  public String getIcon() {
    return icon;
  }

  public String getFavicon() {
    return favicon;
  }

  public boolean isExpired() {
    return expired;
  }
}
