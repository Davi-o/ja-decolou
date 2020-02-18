package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "carro")
public class Car {
    @Id
    @GeneratedValue(generator = "carro_seq", strategy = GenerationType.AUTO)
    @Column(name = "id_carro")
    private int id;
    @Column(name = "modelo")
    private String model;
    @Column(name = "valor")
    private double value;

    @OneToMany(mappedBy = "car")
    private List<Combo> combos;

    public Car(String model, Double value) {
        this.model = model;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getValue() {
        return value;
    }

    public List<Combo> getCombos() {
        return combos;
    }
}
