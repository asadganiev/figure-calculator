package uz.infinbank.validators;

import uz.infinbank.annotations.ValidTriangle;
import uz.infinbank.figures.Triangle;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TriangleConstraintValidator implements ConstraintValidator<ValidTriangle, Triangle> {

    public void initialize(ValidTriangle constraint) {

    }

    public boolean isValid(Triangle triangle, ConstraintValidatorContext context) {

        double a = triangle.getA(), b = triangle.getB(), c = triangle.getC();
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }
}
