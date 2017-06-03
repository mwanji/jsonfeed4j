package jsonfeed4j.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NotNull
@Size(min = 1)
@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = RequiredStringValidator.class)
@Documented
public @interface RequiredString {

  String message() default "{jsonfeed.constraints.requiredString}";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

}
