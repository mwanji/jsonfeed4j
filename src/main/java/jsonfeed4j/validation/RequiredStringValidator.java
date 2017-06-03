package jsonfeed4j.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RequiredStringValidator implements ConstraintValidator<RequiredString, String> {

  @Override
  public void initialize(RequiredString constraintAnnotation) {}

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    return value == null || !value.trim().isEmpty();
  }

}
