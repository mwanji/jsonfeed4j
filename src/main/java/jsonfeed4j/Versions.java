package jsonfeed4j;

public enum Versions {
  VERSION_1;

  public static Versions fromUrl(String url) {
    if ("https://jsonfeed.org/version/1".equals(url)) {
      return VERSION_1;
    }
    
    return null;
  }

}
