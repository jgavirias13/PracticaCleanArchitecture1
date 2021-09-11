package co.com.bancolombia.jpa.producto.ingredientePlato;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface IngredientePlatoDataRepository extends CrudRepository<IngredientePlatoData, Long>,
        QueryByExampleExecutor<IngredientePlatoData> {
}
