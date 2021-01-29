package uz.infinbank.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.infinbank.figures.Circle;
import uz.infinbank.figures.Rectangle;
import uz.infinbank.figures.Square;
import uz.infinbank.figures.Triangle;
import uz.infinbank.services.CalculatorService;

import javax.validation.Valid;

@Log4j2
@RestController
@RequestMapping(value = "/calculator/perimeter",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class PerimeterCalculator {

    private final CalculatorService calculatorService;

    @Autowired
    public PerimeterCalculator(CalculatorService calculatorService) {

        this.calculatorService = calculatorService;
    }

    @PostMapping(value = "/square")
    public Double square(@Valid @RequestBody Square square) {

        log.debug(square);

        return calculatorService.perimeter(square);
    }

    @PostMapping(value = "/rectangle")
    public Double rectangle(@Valid @RequestBody Rectangle rectangle) {

        log.debug(rectangle);

        return calculatorService.perimeter(rectangle);
    }

    @PostMapping(value = "/triangle")
    public Double triangle(@Valid @RequestBody Triangle triangle) {

        log.debug(triangle);

        return calculatorService.perimeter(triangle);
    }

    @PostMapping(value = "/circle")
    public Double circle(@Valid @RequestBody Circle circle) {

        log.debug(circle);

        return calculatorService.perimeter(circle);
    }
}
