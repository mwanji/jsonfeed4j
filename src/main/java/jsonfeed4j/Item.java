package jsonfeed4j;

import java.util.Collections;
import java.util.Map;

public class Item {

  private String id;
  private String contentText;
  private Map<String, Object> extensions = Collections.emptyMap();
  
  public String getId() {
    return id;
  }
  
  public String getContentText() {
    return contentText;
  }

  public Extensions getExtensions() {
    return new Extensions(extensions);
  }
}
