package co.com.bancolombia.model.factura;
import co.com.bancolombia.model.producto.Ingrediente;
import co.com.bancolombia.model.producto.Plato;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class Factura {
    private Long consecutivo;
    private String identificacionCliente;
    private String tipoVenta;
    private List<Plato> platos;
    private List<Ingrediente> ingredientes;
}
