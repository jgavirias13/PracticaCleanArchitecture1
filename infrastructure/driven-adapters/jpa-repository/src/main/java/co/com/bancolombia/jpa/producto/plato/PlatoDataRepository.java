package co.com.bancolombia.jpa.producto.plato;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface PlatoDataRepository extends CrudRepository<PlatoData, Long>, QueryByExampleExecutor<PlatoData> {
}
