package co.com.bancolombia.jpa.producto.ingrediente;

import co.com.bancolombia.jpa.helper.AdapterOperations;
import co.com.bancolombia.model.producto.Ingrediente;
import co.com.bancolombia.model.producto.gateways.IngredienteRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class IngredienteRepositoryAdapter extends
        AdapterOperations<Ingrediente, IngredienteData, Long, IngredienteDataRepository>
        implements IngredienteRepository {

    @Autowired
    public IngredienteRepositoryAdapter(IngredienteDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Ingrediente.class));
    }
}
