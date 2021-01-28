package uz.infinbank.services;

import org.springframework.stereotype.Service;
import uz.infinbank.figures.Circle;
import uz.infinbank.figures.Rectangle;
import uz.infinbank.figures.Square;
import uz.infinbank.figures.Triangle;

@Service
public class CalculatorService {

    /**
     * Formula for Square area is a^2
     */
    public Double area(Square square) {

        return round(Math.pow(square.getWidth(), 2));
    }

    /**
     * Formula for Square area is 4a
     */
    public Double perimeter(Square square) {

        return round(square.getWidth() * 4);
    }

    /**
     * Formula for Rectangle area is width x height
     */
    public Double area(Rectangle rectangle) {

        return round(rectangle.getWidth() * rectangle.getHeight());
    }

    /**
     * Formula for Rectangle area is (a + b) x 2
     */
    public Double perimeter(Rectangle rectangle) {

        return round((rectangle.getWidth() + rectangle.getHeight()) * 2);
    }

    /**
     * Formula for Triangle area
     */
    public Double area(Triangle triangle) {

        if (isValid(triangle)) {
            double a = triangle.getA(), b = triangle.getB(), c = triangle.getC();
            double x = (a + b + c) / 2; // Perimeter / 2
            return Math.sqrt(x * (x - a) * (x - b) * (x - c));
        }

        return 0d;
    }

    private boolean isValid(Triangle triangle) {

        double a = triangle.getA(), b = triangle.getB(), c = triangle.getC();
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }

    /**
     * Formula for Triangle area is a + b + c
     */
    public Double perimeter(Triangle triangle) {

        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    /**
     * Formula for Circle area is Pi x r^2
     */
    public Double area(Circle circle) {

        return round(Math.PI * Math.pow(circle.getRadius(), 2));
    }

    /**
     * Formula for Circle area is 2 * PI * R
     */
    public Double perimeter(Circle circle) {

        return round(2 * Math.PI * circle.getRadius());
    }

    private double round(double value) {

        return Math.round(value * 100.0) / 100.0;
    }
}
