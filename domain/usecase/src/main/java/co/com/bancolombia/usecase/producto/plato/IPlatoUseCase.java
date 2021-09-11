package co.com.bancolombia.usecase.producto.plato;

import co.com.bancolombia.model.producto.IngredientePlato;
import co.com.bancolombia.model.producto.Plato;

import java.util.List;

public interface IPlatoUseCase {
    List<Plato> getPlatos();
    Plato getPlato(Long id);
    Plato addPlato(String nombre, float costo, List<IngredientePlato> ingredientes);
    void deletePlato(Long id);
}
