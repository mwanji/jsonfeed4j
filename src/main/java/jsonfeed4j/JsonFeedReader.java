package jsonfeed4j;

import java.io.Reader;

/**
 * Converts input to a JsonFeed model. As jsonfeed4j's core does not depend on a JSON library, implementations are expected to bind to a specific library and provide configuration options.
 **/
public interface JsonFeedReader {

  JsonFeed read(String string);
  JsonFeed read(Reader reader);
}
