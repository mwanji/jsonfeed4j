package jsonfeed4j.validation;

import static jsonfeed4j.validation.Utils.isNotEmpty;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import jsonfeed4j.Item;

public class ItemContentValidator implements ConstraintValidator<ValidItemContent, Item> {

  @Override
  public void initialize(ValidItemContent constraintAnnotation) {}

  @Override
  public boolean isValid(Item item, ConstraintValidatorContext context) {
    return isNotEmpty(item.getContentText().orElse("")) || isNotEmpty(item.getContentHtml().orElse(""));
  }
  
}
