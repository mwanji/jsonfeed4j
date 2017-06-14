package jsonfeed4j;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import jsonfeed4j.validation.RequiredString;
import jsonfeed4j.validation.ValidItemContent;

@ValidItemContent
public class Item {

  @RequiredString
  private String id;
  private String contentText;
  private String contentHtml;
  private Map<String, Object> extensions = Collections.emptyMap();
  private String url;
  private String externalUrl;
  private String title;
  private String summary;
  private String image;
  private String bannerImage;
  private ZonedDateTime datePublished;
  private ZonedDateTime dateModified;
  @Valid
  private Author author;
  private List<String> tags = Collections.emptyList();
  private List<Attachment> attachments = Collections.emptyList();
  
  public String getId() {
    return id;
  }
  
  public Optional<String> getContentText() {
    return Optional.ofNullable(contentText);
  }
  
  public Optional<String> getContentHtml() {
    return Optional.ofNullable(contentHtml);
  }
  
  public Optional<String> getUrl() {
    return Optional.ofNullable(url);    
  }
  
  public Optional<String> getExternalUrl() {
    return Optional.ofNullable(externalUrl);    
  }
  
  public Optional<String> getTitle() {
    return Optional.ofNullable(title);    
  }
  
  public Optional<String> getSummary() {
    return Optional.ofNullable(summary);    
  }
  
  public Optional<String> getImage() {
    return Optional.ofNullable(image);    
  }
  
  public Optional<String> getBannerImage() {
    return Optional.ofNullable(bannerImage);    
  }
  
  public Optional<ZonedDateTime> getDatePublished() {
    return Optional.ofNullable(datePublished);    
  }
  
  public Optional<ZonedDateTime> getDateModified() {
    return Optional.ofNullable(dateModified);    
  }

  public List<String> getTags() {
    return tags;
  }

  public Optional<Author> getAuthor() {
    return Optional.ofNullable(author);
  }

  public List<Attachment> getAttachments() {
    return attachments ;
  }

  public Extensions getExtensions() {
    return new Extensions(extensions);
  }
}
