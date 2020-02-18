package domain;

import javax.persistence.*;

@Entity
@Table(name = "cidade")
public class City {
    @Id
    @GeneratedValue(generator = "cidade_seq", strategy = GenerationType.AUTO)
    @Column(name = "id_cidade")
    private Integer id;
    @Column(name = "nome")
    private String cityName;

    @OneToOne
    @JoinColumn(name = "id_estado")
    private State state;

    public City(String cityName, State state) {
        this.cityName = cityName;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public State getState() {
        return state;
    }
}
