package co.com.bancolombia.usecase.producto.ingredientePlato;

import co.com.bancolombia.model.producto.Ingrediente;
import co.com.bancolombia.model.producto.IngredientePlato;
import co.com.bancolombia.model.producto.Plato;

import java.util.List;

public interface IIngredientePlatoUseCase {
    IngredientePlato addIngredientePlato(Ingrediente ingrediente, int cantidad, Plato plato);
    List<IngredientePlato> addIngredientesPlato(List<IngredientePlato> ingredientesPlato);
    void deleteIngredientePlato(Long id);
}
