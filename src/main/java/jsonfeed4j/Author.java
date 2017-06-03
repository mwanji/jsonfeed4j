package jsonfeed4j;

import validation.ValidAuthor;

@ValidAuthor
public class Author {

  private String name;
  private String url;
  private String avatar;
  
  public String getName() {
    return name;
  }
  
  public String getUrl() {
    return url;
  }
  
  public String getAvatar() {
    return avatar;
  }
}