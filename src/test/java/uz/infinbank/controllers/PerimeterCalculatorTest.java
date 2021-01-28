package uz.infinbank.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import uz.infinbank.figures.Circle;
import uz.infinbank.figures.Rectangle;
import uz.infinbank.figures.Square;
import uz.infinbank.figures.Triangle;
import uz.infinbank.services.CalculatorService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@MockBean(classes = {CalculatorService.class})
@WebMvcTest(controllers = PerimeterCalculator.class)
class PerimeterCalculatorTest {

    private static ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CalculatorService calculator;

    private static String toJson(final Object obj) throws JsonProcessingException {

        return objectMapper.writeValueAsString(obj);
    }

    @Test
    void square() throws Exception {

        when(calculator.perimeter(any(Square.class))).thenReturn(42.0);

        Square square = new Square();

        mockMvc.perform(post("/calculator/perimeter/square")
                .content(toJson(square))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());

        square.setWidth(20);

        mockMvc.perform(post("/calculator/perimeter/square")
                .content(toJson(square))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("42.0"));
    }

    @Test
    void rectangle() throws Exception {

        when(calculator.perimeter(any(Rectangle.class))).thenReturn(42.0);

        Rectangle rectangle = new Rectangle();

        mockMvc.perform(post("/calculator/perimeter/rectangle")
                .content(toJson(rectangle))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());

        rectangle.setHeight(20);
        rectangle.setWidth(20);

        mockMvc.perform(post("/calculator/perimeter/rectangle")
                .content(toJson(rectangle))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("42.0"));
    }

    @Test
    void triangle() throws Exception {

        when(calculator.perimeter(any(Triangle.class))).thenReturn(42.0);

        Triangle triangle = new Triangle();

        mockMvc.perform(post("/calculator/perimeter/triangle")
                .content(toJson(triangle))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());

        triangle.setA(20);
        triangle.setB(40);
        triangle.setC(50);

        mockMvc.perform(post("/calculator/perimeter/triangle")
                .content(toJson(triangle))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("42.0"));
    }

    @Test
    void circle() throws Exception {

        when(calculator.perimeter(any(Circle.class))).thenReturn(42.0);

        Circle circle = new Circle();

        mockMvc.perform(post("/calculator/perimeter/circle")
                .content(toJson(circle))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());

        circle.setRadius(20);

        mockMvc.perform(post("/calculator/perimeter/circle")
                .content(toJson(circle))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("42.0"));
    }
}