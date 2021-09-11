package co.com.bancolombia.model.producto.gateways;

import co.com.bancolombia.model.producto.Plato;

import java.util.List;

public interface PlatoRepository {
    Plato save(Plato plato);
    Plato findById(Long id);
    List<Plato> findAll();
    void deleteById(Long id);
}
