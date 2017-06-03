package jsonfeed4j;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import javax.activation.MimeType;

public class Attachment {

  private String url;
  private MimeType mimeType;
  private String title;
  private Long sizeInBytes;
  private Long durationInSeconds;
  private Map<String, Object> extensions = Collections.emptyMap();
  
  public String getUrl() {
    return url;
  }
  
  public MimeType getMimeType() {
    return mimeType;
  }
  
  public Optional<String> getTitle() {
    return Optional.ofNullable(title);
  }
  
  public Optional<Long> getSizeInBytes() {
    return Optional.ofNullable(sizeInBytes);
  }
  
  public Optional<Long> getDurationInSeconds() {
    return Optional.ofNullable(durationInSeconds);
  }
  
  public Extensions getExtensions() {
    return new Extensions(extensions);
  }
}
