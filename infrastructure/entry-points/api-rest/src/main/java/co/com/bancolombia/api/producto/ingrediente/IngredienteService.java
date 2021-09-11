package co.com.bancolombia.api.producto.ingrediente;

import co.com.bancolombia.model.producto.Ingrediente;
import co.com.bancolombia.usecase.producto.ingrediente.IIngredienteUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/ingredientes", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class IngredienteService {

    private final IIngredienteUseCase ingredienteUseCase;

    @GetMapping
    public List<Ingrediente> getIngredientes(){
        return this.ingredienteUseCase.getIngredientes();
    }

    @GetMapping("/{id}")
    public Ingrediente getIngrediente(@PathVariable String id){
        return this.ingredienteUseCase.getIngrediente(Long.parseLong(id));
    }

    @PostMapping
    public Ingrediente addIngrediente(@RequestBody IngredienteData ingredienteData){
        return this.ingredienteUseCase.addIngrediente(ingredienteData.getNombre(), ingredienteData.getCosto());
    }

    @DeleteMapping("/{id}")
    public void deleteIngrediente(@PathVariable String id){
        this.ingredienteUseCase.deleteIngrediente(Long.parseLong(id));
    }
}
