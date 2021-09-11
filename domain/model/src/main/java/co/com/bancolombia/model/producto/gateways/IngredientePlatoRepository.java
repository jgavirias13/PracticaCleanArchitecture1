package co.com.bancolombia.model.producto.gateways;

import co.com.bancolombia.model.producto.IngredientePlato;

import java.util.List;

public interface IngredientePlatoRepository {
    IngredientePlato save(IngredientePlato ingredientePlato);
    List<IngredientePlato> saveAll(List<IngredientePlato> ingredientesPlatos);
    IngredientePlato findById(Long id);
    List<IngredientePlato> findAll();
    void deleteById(Long id);
}
