package jsonfeed4j.testutils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Path;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import jsonfeed4j.JsonFeed;
import jsonfeed4j.JsonFeedReader;
import jsonfeed4j.Versions;

public class GsonJsonFeedReader implements JsonFeedReader {
  
  private final Gson gson = new GsonBuilder().registerTypeAdapter(Versions.class, new VersionsDeserializer()).create();
  
  @Override
  public JsonFeed read(String jsonFeed) {
    return gson.fromJson(jsonFeed, JsonFeed.class);
  }

  @Override
  public JsonFeed read(Path jsonFeed) {
    return null;
  }

  @Override
  public JsonFeed read(InputStream jsonFeed) {
    return read(new InputStreamReader(jsonFeed));
  }

  @Override
  public JsonFeed read(Reader jsonFeed) {
    return gson.fromJson(jsonFeed, JsonFeed.class);
  }

  private static class VersionsDeserializer implements JsonDeserializer<Versions> {

    @Override
    public Versions deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
      return Versions.fromUrl(json.getAsString());
    }
    
  }
}
