package org.biins.validation.collection.constraints.impl;

import org.biins.validation.collection.constraints.ElementsAssertTrue;

import javax.validation.ConstraintValidator;
import java.util.Collection;

/**
 * @author Martin Janys
 */
public class ElementsAssertTrueConstraintValidator
        extends AbstractCollectionValidator<ElementsAssertTrue, Collection>
        implements ConstraintValidator<ElementsAssertTrue, Collection> {

    public void initialize(ElementsAssertTrue constraintAnnotation) {
        initialize(constraintAnnotation.value(), constraintAnnotation.element(), constraintAnnotation.message());
    }
}
