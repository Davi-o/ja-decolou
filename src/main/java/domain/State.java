package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estado")
public class State {
    @Id
    @GeneratedValue(generator = "estado_seq", strategy = GenerationType.AUTO)
    @Column(name = "id_estado")
    private int id;
    @Column(name = "nome")
    private String name;

    @OneToMany (mappedBy = "state")
    private List<City> cities;

    public State(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<City> getCities() {
        return cities;
    }
}
