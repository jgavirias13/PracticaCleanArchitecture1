package co.com.bancolombia.jpa.producto.ingrediente;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Ingrediente")
@NoArgsConstructor
public class IngredienteData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private float costo;
}
