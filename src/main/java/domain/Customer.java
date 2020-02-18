package domain;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Customer {

    @Id
    @GeneratedValue(generator = "cliente_seq", strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "documento")
    private String document;
    @Column(name = "nome")
    private String nome;

    public Customer(String document, String nome) {
        this.document = document;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
