package co.com.bancolombia.jpa.producto.ingredientePlato;

import co.com.bancolombia.jpa.helper.AdapterOperations;
import co.com.bancolombia.model.producto.IngredientePlato;
import co.com.bancolombia.model.producto.gateways.IngredientePlatoRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IngredientePlatoRepositoryAdapter extends
        AdapterOperations<IngredientePlato, IngredientePlatoData, Long, IngredientePlatoDataRepository>
        implements IngredientePlatoRepository {

    @Autowired
    public IngredientePlatoRepositoryAdapter(IngredientePlatoDataRepository repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.map(d, IngredientePlato.class));
    }

    @Override
    public List<IngredientePlato> saveAll(List<IngredientePlato> ingredientesPlatos) {
        return super.saveAllEntities(ingredientesPlatos);
    }
}
