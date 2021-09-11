package co.com.bancolombia.jpa.producto.ingredientePlato;

import co.com.bancolombia.jpa.producto.ingrediente.IngredienteData;
import co.com.bancolombia.jpa.producto.plato.PlatoData;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "IngredientePlato")
@NoArgsConstructor
public class IngredientePlatoData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int cantidad;

    @ManyToOne
    private IngredienteData ingrediente;

    @JsonBackReference
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plato_id")
    private PlatoData plato;
}
