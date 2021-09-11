package co.com.bancolombia.api.producto.plato;

import co.com.bancolombia.api.producto.ingredientePlato.IngredientePlatoData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@RequiredArgsConstructor
@AllArgsConstructor
public class PlatoData {
    private Long id;
    private String nombre;
    private float costo;
    private List<IngredientePlatoData> ingredientes;
}
