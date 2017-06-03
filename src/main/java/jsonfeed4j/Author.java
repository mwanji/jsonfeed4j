package jsonfeed4j;

import java.util.Collections;
import java.util.Map;

import validation.ValidAuthor;

@ValidAuthor
public class Author {

  private String name;
  private String url;
  private String avatar;
  private Map<String, Object> extensions = Collections.emptyMap();
  
  public String getName() {
    return name;
  }
  
  public String getUrl() {
    return url;
  }
  
  public String getAvatar() {
    return avatar;
  }

  public Extensions getExtensions() {
    return new Extensions(extensions);
  }
}
