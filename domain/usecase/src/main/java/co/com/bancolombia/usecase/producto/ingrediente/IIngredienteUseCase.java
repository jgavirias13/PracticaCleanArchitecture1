package co.com.bancolombia.usecase.producto.ingrediente;

import co.com.bancolombia.model.producto.Ingrediente;

import java.util.List;

public interface IIngredienteUseCase {
    List<Ingrediente> getIngredientes();
    Ingrediente getIngrediente(Long id);
    Ingrediente addIngrediente(String nombre, float costo);
    void deleteIngrediente(Long id);
}
