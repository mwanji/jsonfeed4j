package jsonfeed4j;

import java.util.Collections;
import java.util.Map;

import jsonfeed4j.validation.RequiredString;

public class Hub {

  @RequiredString
  private String type;
  
  @RequiredString
  private String url;

  private Map<String, Object> extensions = Collections.emptyMap();

  public String getType() {
    return type;
  }

  public String getUrl() {
    return url;
  }

  public Extensions getExtensions() {
    return new Extensions(extensions);
  }
}
