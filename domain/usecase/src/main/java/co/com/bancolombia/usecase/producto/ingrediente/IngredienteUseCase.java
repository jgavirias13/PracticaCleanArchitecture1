package co.com.bancolombia.usecase.producto.ingrediente;

import co.com.bancolombia.model.producto.Ingrediente;
import co.com.bancolombia.model.producto.gateways.IngredienteRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class IngredienteUseCase implements IIngredienteUseCase{

    private final IngredienteRepository ingredienteRepository;

    @Override
    public List<Ingrediente> getIngredientes() {
        return ingredienteRepository.findAll();
    }

    @Override
    public Ingrediente getIngrediente(Long id) {
        return ingredienteRepository.findById(id);
    }

    @Override
    public Ingrediente addIngrediente(String nombre, float costo) {
        Ingrediente ingrediente = Ingrediente.builder().build();
        ingrediente.setNombre(nombre);
        ingrediente.setCosto(costo);
        return ingredienteRepository.save(ingrediente);
    }

    @Override
    public void deleteIngrediente(Long id) {
        ingredienteRepository.deleteById(id);
    }
}
