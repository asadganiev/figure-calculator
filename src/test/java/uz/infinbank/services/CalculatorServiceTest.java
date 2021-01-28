package uz.infinbank.services;

import org.junit.jupiter.api.Test;
import uz.infinbank.figures.Circle;
import uz.infinbank.figures.Rectangle;
import uz.infinbank.figures.Square;
import uz.infinbank.figures.Triangle;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    @Test
    void areaFor() {

        CalculatorService calculator = new CalculatorService();

        // Testing Squares
        assertEquals(100.0, calculator.areaFor(new Square(10.0)), 0.0);
        assertEquals(144.0, calculator.areaFor(new Square(12.0)), 0.0);
        assertEquals(692224.0, calculator.areaFor(new Square(832.0)), 0.0);
        assertEquals(81.0, calculator.areaFor(new Square(9)), 0.0);

        // Testing Rectangles
        assertEquals(800, calculator.areaFor(new Rectangle(20, 40)), 0.0);
        assertEquals(360.0, calculator.areaFor(new Rectangle(15, 24)), 0.0);
        assertEquals(1035.0, calculator.areaFor(new Rectangle(45, 23)), 0.0);
        assertEquals(216.0, calculator.areaFor(new Rectangle(12, 18)), 0.0);

        // Testing Triangles
        assertEquals(225.0, calculator.areaFor(new Triangle(30, 15)), 0.0);
        assertEquals(4000.0, calculator.areaFor(new Triangle(400, 20)), 0.0);
        assertEquals(500.0, calculator.areaFor(new Triangle(20, 50)), 0.0);
        assertEquals(5000.0, calculator.areaFor(new Triangle(100, 100)), 0.0);

        // Testing Circles
        assertEquals(1256.64, calculator.areaFor(new Circle(20.0)), 1e-2);
        assertEquals(9160.88, calculator.areaFor(new Circle(54.0)), 1e-2);
        assertEquals(11689.87, calculator.areaFor(new Circle(61.0)), 1e-2);
        assertEquals(19113.45, calculator.areaFor(new Circle(78.0)), 1e-2);
    }
}