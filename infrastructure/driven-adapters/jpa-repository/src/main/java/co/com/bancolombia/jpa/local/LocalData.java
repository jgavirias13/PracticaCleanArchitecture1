package co.com.bancolombia.jpa.local;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="Local")
@NoArgsConstructor
public class LocalData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
