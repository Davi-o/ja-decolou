package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "modalidade")
public class Modality {
    @Id
    @GeneratedValue(generator = "modalidade_seq", strategy = GenerationType.AUTO)
    @Column(name = "id_modalidade")
    private int id;
    @Column(name = "tipo")
    private String modalityType;
    @OneToMany(mappedBy = "modality")
    private List<Ticket> ticketList;



}
