package jsonfeed4j;

import java.io.InputStream;
import java.io.Reader;
import java.nio.file.Path;

public interface JsonFeedReader {

  JsonFeed read(String string);
  JsonFeed read(Path path);
  JsonFeed read(InputStream inputStream);
  JsonFeed read(Reader reader);
}
