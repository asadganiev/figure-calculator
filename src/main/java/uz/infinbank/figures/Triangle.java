package uz.infinbank.figures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Triangle {

    @Positive
    private double base;
    @Positive
    private double height;
}


