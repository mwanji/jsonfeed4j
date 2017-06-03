package jsonfeed4j;

public enum Version {
  VERSION_1;

  public static Version fromUrl(String url) {
    if ("https://jsonfeed.org/version/1".equals(url)) {
      return VERSION_1;
    }
    
    return null;
  }

}
