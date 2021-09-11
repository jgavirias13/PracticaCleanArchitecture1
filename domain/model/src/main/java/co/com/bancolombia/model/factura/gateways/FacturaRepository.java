package co.com.bancolombia.model.factura.gateways;

import co.com.bancolombia.model.factura.Factura;

import java.util.List;

public interface FacturaRepository {
    Factura save(Factura factura);
    Factura findByConsecutivo(String consecutivo);
    List<Factura> findAll();
    void deleteByConsecutivo(String consecutivo);
}
