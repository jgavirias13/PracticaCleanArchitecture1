package co.com.bancolombia.usecase.producto.plato;

import co.com.bancolombia.model.producto.Ingrediente;
import co.com.bancolombia.model.producto.IngredientePlato;
import co.com.bancolombia.model.producto.Plato;
import co.com.bancolombia.model.producto.gateways.IngredientePlatoRepository;
import co.com.bancolombia.model.producto.gateways.PlatoRepository;
import co.com.bancolombia.usecase.producto.ingredientePlato.IIngredientePlatoUseCase;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.List;

@RequiredArgsConstructor
public class PlatoUseCase implements IPlatoUseCase{

    private final PlatoRepository platoRepository;
    private final IngredientePlatoRepository ingredientePlatoRepository;

    @Override
    public List<Plato> getPlatos() {
        return this.platoRepository.findAll();
    }

    @Override
    public Plato getPlato(Long id) {
        return this.platoRepository.findById(id);
    }

    @Override
    public Plato addPlato(String nombre, float costo, List<IngredientePlato> ingredientes) {

        Plato plato = Plato.builder().build();
        plato.setNombre(nombre);
        plato.setCosto(costo);
        plato.setIngredientes(new HashSet<>(ingredientes));
        Plato nuevoPlato = this.platoRepository.save(plato);

        ingredientes.forEach(ingredientePlato -> ingredientePlato.setPlato(nuevoPlato));
        ingredientePlatoRepository.saveAll(ingredientes);

        return nuevoPlato;
    }

    @Override
    public void deletePlato(Long id) {
        this.platoRepository.deleteById(id);
    }
}
