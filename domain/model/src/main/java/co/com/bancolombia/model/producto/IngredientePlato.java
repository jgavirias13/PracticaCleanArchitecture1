package co.com.bancolombia.model.producto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder(toBuilder = true)
@RequiredArgsConstructor
@AllArgsConstructor
public class IngredientePlato {
    private Long id;
    private int cantidad;
    private Ingrediente ingrediente;
    private Plato plato;
}
