package br.com.lucasmonteiro.projetojpa4.model;

import javax.persistence.*;

@Entity
public class Fabricante {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @ManyToOne
    private Pais pais;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
