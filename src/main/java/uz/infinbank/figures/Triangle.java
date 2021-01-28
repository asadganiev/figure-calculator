package uz.infinbank.figures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.infinbank.annotations.ValidTriangle;

import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ValidTriangle
public class Triangle {

    @Positive
    private double a;
    @Positive
    private double b;
    @Positive
    private double c;
}


