package co.com.bancolombia.usecase.factura;

import co.com.bancolombia.model.factura.Factura;

import java.util.List;

public interface IFacturaUseCase {
    List<Factura> getFacturas();
    Factura getFactura(String consecutivo);
    Factura addFactura(Factura factura);
    void deleteFactura(String id);
}
