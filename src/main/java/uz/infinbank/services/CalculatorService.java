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
    public Double areaFor(Square square) {

        return round(Math.pow(square.getWidth(), 2));
    }

    /**
     * Formula for Rectangle area is width x height
     */
    public Double areaFor(Rectangle rectangle) {

        return round(rectangle.getWidth() * rectangle.getHeight());
    }

    /**
     * Formula for Triangle area is 1/2 x base x height
     */
    public Double areaFor(Triangle triangle) {

        return round(triangle.getBase() * triangle.getHeight() / 2);
    }

    /**
     * Formula for Circle area is Pi x r^2
     */
    public Double areaFor(Circle circle) {

        return round(Math.PI * Math.pow(circle.getRadius(), 2));
    }

    private double round(double value){

        return Math.round(value * 100.0) / 100.0;
    }
}
