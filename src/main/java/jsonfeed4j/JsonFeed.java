package jsonfeed4j;

import java.util.List;

public class JsonFeed {
  
  private Versions version;
  private String title;
  private List<Item> items;

  public Versions getVersion() {
    return version;
  }

  public String getTitle() {
    return title;
  }

  public List<Item> getItems() {
    return items;
  }

}
