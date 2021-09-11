package co.com.bancolombia.jpa.producto.ingrediente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface IngredienteDataRepository extends CrudRepository<IngredienteData, Long>,
        QueryByExampleExecutor<IngredienteData> {
}
