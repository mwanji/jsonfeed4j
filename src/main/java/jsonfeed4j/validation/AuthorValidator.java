package jsonfeed4j.validation;

import static jsonfeed4j.validation.Utils.isNotEmpty;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import jsonfeed4j.Author;

public class AuthorValidator implements ConstraintValidator<ValidAuthor, Author> {

  @Override
  public void initialize(ValidAuthor constraintAnnotation) {}

  @Override
  public boolean isValid(Author author, ConstraintValidatorContext context) {
    return isNotEmpty(author.getName()) || isNotEmpty(author.getAvatar()) || isNotEmpty(author.getUrl());
  }
}
