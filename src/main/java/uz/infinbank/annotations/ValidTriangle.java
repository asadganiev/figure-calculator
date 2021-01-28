package uz.infinbank.annotations;

import uz.infinbank.validators.TriangleConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = TriangleConstraintValidator.class)
@Target({TYPE, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
public @interface ValidTriangle {

    String message() default "Invalid triangle";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
