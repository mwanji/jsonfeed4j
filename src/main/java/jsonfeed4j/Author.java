package jsonfeed4j;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import jsonfeed4j.validation.ValidAuthor;

@ValidAuthor
public class Author {

  private String name;
  private String url;
  private String avatar;
  private Map<String, Object> extensions = Collections.emptyMap();
  
  public Optional<String> getName() {
    return Optional.ofNullable(name);
  }
  
  public Optional<String>getUrl() {
    return Optional.ofNullable(url);
  }
  
  public Optional<String> getAvatar() {
    return Optional.ofNullable(avatar);
  }

  public Extensions getExtensions() {
    return new Extensions(extensions);
  }
}
