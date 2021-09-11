package co.com.bancolombia.model.producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Builder(toBuilder = true)
@RequiredArgsConstructor
@AllArgsConstructor
public class Plato extends Producto {
    @Builder.Default
    private Set<IngredientePlato> ingredientes = new HashSet<>();

    public Set<IngredientePlato> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Set<IngredientePlato> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
