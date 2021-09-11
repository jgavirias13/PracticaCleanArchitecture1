package co.com.bancolombia.model.local;
import co.com.bancolombia.model.producto.Ingrediente;
import co.com.bancolombia.model.producto.Plato;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class Local {
    private Long id;
    private String region;
    private String nombre;
    private List<Plato> platos;
    private List<Ingrediente> ingredientes;
}
