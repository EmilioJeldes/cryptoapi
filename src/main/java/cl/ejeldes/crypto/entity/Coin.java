package cl.ejeldes.crypto.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by emilio on Jan 18, 2019
 */
@Getter
@Setter
@NoArgsConstructor
@Document
public class Coin {

    @Id
    private String id;
    private String nombre;
    private String icono;
    private double precio;
    private double score;
    private double profit;
    private int ranking;
    private List<Double> grafico;

}
