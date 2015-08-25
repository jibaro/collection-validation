package org.capsules.validation.collection.constraints.impl;

import org.capsules.validation.collection.constraints.ElementsSize;

import javax.validation.ConstraintValidator;
import java.util.Collection;

/**
 * @author Martin Janys
 */
public class ElementsSizeValidator
        extends CollectionValidatorSupport<ElementsSize, Collection>
        implements ConstraintValidator<ElementsSize, Collection> {

    public void initialize(ElementsSize constraintAnnotation) {
        initialize(constraintAnnotation.value(), constraintAnnotation.element(), constraintAnnotation.message());
    }
}
