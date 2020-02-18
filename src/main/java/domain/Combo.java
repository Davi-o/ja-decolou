package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "combo")
public class Combo {
    @Id
    @GeneratedValue(generator = "combo_seq", strategy = GenerationType.AUTO)
    @Column (name="id_combo")
    private int id;

    @OneToOne
    @JoinColumn (name="id_carro")
    private Car car;

    @OneToMany(mappedBy = "combo")
    private List<Ticket> ticketList;

    public Combo(Car car) {
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public Car getCar() {
        return car;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }
}
