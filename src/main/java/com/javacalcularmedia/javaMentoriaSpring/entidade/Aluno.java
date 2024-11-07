package com.javacalcularmedia.javaMentoriaSpring.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// AlunoEntidade
// usar a JPA -> JDBC
@Entity
public class Aluno {

    @Id
    @GeneratedValue
    private long Id;
    private String nome;
    private String notas;

    // Getters e Setters
    public long getId() { return Id; }

    public void setId(long id) { Id = id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) { this.notas = notas; }

}
