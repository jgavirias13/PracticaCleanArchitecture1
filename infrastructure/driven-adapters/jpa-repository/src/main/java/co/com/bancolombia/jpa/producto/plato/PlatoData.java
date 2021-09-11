package co.com.bancolombia.jpa.producto.plato;

import co.com.bancolombia.jpa.producto.ingredientePlato.IngredientePlatoData;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "Plato")
@NoArgsConstructor
public class PlatoData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private float costo;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plato", fetch = FetchType.EAGER)
    private Set<IngredientePlatoData> ingredientesPlato;
}
