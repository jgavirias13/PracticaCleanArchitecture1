package co.com.bancolombia.api.producto.ingredientePlato;

import co.com.bancolombia.api.producto.ingrediente.IngredienteData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder(toBuilder = true)
@RequiredArgsConstructor
@AllArgsConstructor
public class IngredientePlatoData {
    private Long id;
    private IngredienteData ingrediente;
    private int cantidad;
}
