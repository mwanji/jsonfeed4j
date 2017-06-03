package jsonfeed4j;

import java.io.Reader;

public interface JsonFeedReader {

  JsonFeed read(String string);
  JsonFeed read(Reader reader);
}
