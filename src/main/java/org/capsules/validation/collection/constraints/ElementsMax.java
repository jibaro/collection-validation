package org.capsules.validation.collection.constraints;

import org.capsules.validation.collection.constraints.impl.ElementsMaxValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Max;
import java.lang.annotation.*;
import java.math.BigDecimal;

/**
 * @see {@link Max}
 *
 * @author Martin Janys
 */
@Documented
@Constraint(validatedBy = ElementsMaxValidator.class)
@Target({
        ElementType.METHOD,
        ElementType.FIELD
})
@Retention(RetentionPolicy.RUNTIME)
public @interface ElementsMax {

    Max value();

    Class<?> element() default BigDecimal.class;

    String message() default "{validation.collection.constraints.ElementsMax[]}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
