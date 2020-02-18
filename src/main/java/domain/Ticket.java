package domain;

import org.hibernate.annotations.LazyToOne;

import javax.persistence.*;

@Entity
@Table (name="passagem")
public class Ticket {
    @Id
    @GeneratedValue(generator = "passagem_seq", strategy = GenerationType.AUTO)
    @Column(name = "id_passagem")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id_cidade")
    private City city;

    @OneToOne
    @JoinColumn(name = "id_modalidade")
    private Modality modality;

    @Column(name = "valor")
    private Double value;

//    @Column(name = "disponibilidade")
//    private Boolean disponibility;

    @OneToOne
    @JoinColumn(name = "id_combo")
    private Combo combo;

    public Ticket(City city, Modality modality, Double value, Combo combo/*, Boolean disponibility*/) {
        this.city = city;
        this.modality = modality;
        this.value = value;
        this.combo = combo;
//        this.disponibility = disponibility;
    }

    public Integer getId() {
        return id;
    }

    public City getCity() {
        return city;
    }

    public Modality getModality() {
        return modality;
    }

    public Double getValue() {
        return value;
    }

    public Combo getCombo() {
        return combo;
    }

    //    public Boolean getDisponibility() {
//        return disponibility;
//    }
}
