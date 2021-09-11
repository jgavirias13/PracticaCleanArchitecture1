package co.com.bancolombia.api.producto.ingrediente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder(toBuilder = true)
@RequiredArgsConstructor
@AllArgsConstructor
public class IngredienteData {
    private Long id;
    private String nombre;
    private float costo;
}
