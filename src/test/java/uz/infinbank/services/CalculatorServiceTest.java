package uz.infinbank.services;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import uz.infinbank.figures.Circle;
import uz.infinbank.figures.Rectangle;
import uz.infinbank.figures.Square;
import uz.infinbank.figures.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTest {

    private static CalculatorService calculator;

    @BeforeAll
    static void setUp() {

        calculator = new CalculatorService();
    }

    @Test
    void area() {

        // Testing Squares
        assertEquals(100.0, calculator.area(new Square(10.0)), 1e-2);
        assertEquals(144.0, calculator.area(new Square(12.0)), 1e-2);
        assertEquals(692224.0, calculator.area(new Square(832.0)), 1e-2);
        assertEquals(81.0, calculator.area(new Square(9)), 1e-2);

        // Testing Rectangles
        assertEquals(800, calculator.area(new Rectangle(20, 40)), 1e-2);
        assertEquals(360.0, calculator.area(new Rectangle(15, 24)), 1e-2);
        assertEquals(1035.0, calculator.area(new Rectangle(45, 23)), 1e-2);
        assertEquals(216.0, calculator.area(new Rectangle(12, 18)), 1e-2);

        // Testing Triangles
        assertEquals(6d, calculator.area(new Triangle(3, 4, 5)), 1e-2);
        assertEquals(600, calculator.area(new Triangle(30, 40, 50)), 1e-2);
        assertEquals(60000, calculator.area(new Triangle(300, 400, 500)), 1e-2);
        assertEquals(6000000, calculator.area(new Triangle(3000, 4000, 5000)), 1e-2);

        // Testing Circles
        assertEquals(1256.64, calculator.area(new Circle(20.0)), 1e-2);
        assertEquals(9160.88, calculator.area(new Circle(54.0)), 1e-2);
        assertEquals(11689.87, calculator.area(new Circle(61.0)), 1e-2);
        assertEquals(19113.45, calculator.area(new Circle(78.0)), 1e-2);
    }

    @Test
    void perimeter() {

        // Testing Squares
        assertEquals(40.0, calculator.perimeter(new Square(10.0)), 1e-2);
        assertEquals(100.0, calculator.perimeter(new Square(25.0)), 1e-2);
        assertEquals(64.0, calculator.perimeter(new Square(16.0)), 1e-2);
        assertEquals(200.0, calculator.perimeter(new Square(50.)), 1e-2);

        // Testing Rectangles
        assertEquals(120.0, calculator.perimeter(new Rectangle(20, 40)), 1e-2);
        assertEquals(100.0, calculator.perimeter(new Rectangle(30, 20)), 1e-2);
        assertEquals(100.0, calculator.perimeter(new Rectangle(24, 26)), 1e-2);
        assertEquals(400.0, calculator.perimeter(new Rectangle(100, 100)), 1e-2);

        // Testing Triangles
        assertEquals(55.0, calculator.perimeter(new Triangle(30, 15, 10)), 1e-20);
        assertEquals(500.0, calculator.perimeter(new Triangle(100, 150, 250)), 1e-2);
        assertEquals(60.0, calculator.perimeter(new Triangle(10, 20, 30)), 1e-2);
        assertEquals(150.0, calculator.perimeter(new Triangle(30, 50, 70)), 1e-2);

        // Testing Circles
        assertEquals(125.66, calculator.perimeter(new Circle(20.0)), 1e-2);
        assertEquals(188.50, calculator.perimeter(new Circle(30.0)), 1e-2);
        assertEquals(251.33, calculator.perimeter(new Circle(40.0)), 1e-2);
        assertEquals(314.16, calculator.perimeter(new Circle(50.0)), 1e-2);
    }
}