package co.com.bancolombia.api.producto.plato;

import co.com.bancolombia.model.producto.Ingrediente;
import co.com.bancolombia.model.producto.IngredientePlato;
import co.com.bancolombia.model.producto.Plato;
import co.com.bancolombia.usecase.producto.ingredientePlato.IIngredientePlatoUseCase;
import co.com.bancolombia.usecase.producto.plato.IPlatoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/platos", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class PlatoService {
    private final IPlatoUseCase platoUseCase;

    @GetMapping
    public List<Plato> getPlatos(){
        return this.platoUseCase.getPlatos();
    }

    @GetMapping("/{id}")
    public Plato getPlato(@PathVariable String id){
        return this.platoUseCase.getPlato(Long.parseLong(id));
    }

    @PostMapping
    public Plato addPlato(@RequestBody PlatoData plato){
        List<IngredientePlato> ingredientesPlato = new ArrayList<>();
        plato.getIngredientes().forEach(ingredientePlatoData -> {
            Ingrediente ingrediente = Ingrediente.builder().build();
            ingrediente.setId(ingredientePlatoData.getIngrediente().getId());
            ingredientesPlato.add(IngredientePlato.builder()
                    .ingrediente(ingrediente)
                    .cantidad(ingredientePlatoData.getCantidad()).build());
        });
        return this.platoUseCase.addPlato(plato.getNombre(), plato.getCosto(), ingredientesPlato);
    }

    @DeleteMapping("/{id}")
    public void deletePlato(@PathVariable String id){
        this.platoUseCase.deletePlato(Long.parseLong(id));
    }
}
