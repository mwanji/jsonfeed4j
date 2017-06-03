package jsonfeed4j;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Extensions {

  private final Map<String, Object> extensions;

  Extensions(Map<String, Object> extensions) {
    this.extensions = extensions;
  }

  public Object get(String key) {
    return extensions.get(key);
  }

  @SuppressWarnings("unchecked")
  public Map<String, Object> getMap(String key) {
    return (Map<String, Object>) extensions.get(key);
  }

  @SuppressWarnings("unchecked")
  public List<Object> getList(String key) {
    return (List<Object>) extensions.get(key);
  }
}
