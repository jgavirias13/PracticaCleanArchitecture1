package co.com.bancolombia.model.producto.gateways;

import co.com.bancolombia.model.producto.Ingrediente;

import java.util.List;

public interface IngredienteRepository {
    Ingrediente save(Ingrediente ingrediente);
    Ingrediente findById(Long id);
    List<Ingrediente> findAll();
    void deleteById(Long id);
}
