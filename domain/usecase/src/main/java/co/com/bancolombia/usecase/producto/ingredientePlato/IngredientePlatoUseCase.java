package co.com.bancolombia.usecase.producto.ingredientePlato;

import co.com.bancolombia.model.producto.Ingrediente;
import co.com.bancolombia.model.producto.IngredientePlato;
import co.com.bancolombia.model.producto.Plato;
import co.com.bancolombia.model.producto.gateways.IngredientePlatoRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class IngredientePlatoUseCase implements IIngredientePlatoUseCase {

    private IngredientePlatoRepository ingredientePlatoRepository;

    @Override
    public IngredientePlato addIngredientePlato(Ingrediente ingrediente, int cantidad, Plato plato) {
        IngredientePlato ingredientePlato = IngredientePlato.builder()
                .cantidad(cantidad)
                .ingrediente(ingrediente)
                .plato(plato)
                .build();
        return this.ingredientePlatoRepository.save(ingredientePlato);
    }

    @Override
    public List<IngredientePlato> addIngredientesPlato(List<IngredientePlato> ingredientesPlato) {
        return ingredientePlatoRepository.saveAll(ingredientesPlato);
    }

    @Override
    public void deleteIngredientePlato(Long id) {
        ingredientePlatoRepository.deleteById(id);
    }
}
