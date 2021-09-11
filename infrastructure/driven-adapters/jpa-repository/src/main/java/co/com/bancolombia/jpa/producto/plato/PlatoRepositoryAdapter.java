package co.com.bancolombia.jpa.producto.plato;

import co.com.bancolombia.jpa.helper.AdapterOperations;
import co.com.bancolombia.model.producto.IngredientePlato;
import co.com.bancolombia.model.producto.Plato;
import co.com.bancolombia.model.producto.gateways.PlatoRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class PlatoRepositoryAdapter extends
        AdapterOperations<Plato, PlatoData, Long, PlatoDataRepository>
        implements PlatoRepository {

    @Autowired
    public PlatoRepositoryAdapter(PlatoDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> {
            Plato p = mapper.map(d, Plato.class);
            Set<IngredientePlato> ingredientes = new HashSet<>();
            d.getIngredientesPlato().forEach(i -> {
                ingredientes.add(mapper.map(i, IngredientePlato.class));
            });
            p.setIngredientes(ingredientes);
            return p;
        });
    }
}
