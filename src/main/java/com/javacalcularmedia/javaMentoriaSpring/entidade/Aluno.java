package com.javacalcularmedia.javaMentoriaSpring.entidade;

import java.util.regex.Pattern;

public class Aluno {
    private String nome;
    private String notas;

    Pattern patFloat = Pattern.compile("^-?\\d+(\\.\\d+)?$");

    // Getters e Setters
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

    public float getMedia() {
        String[] splitNotas = this.notas.replace(" ", "").replace(",", ".").split(";");
        float total = 0;
        int cont = 0;
        for (String nota : splitNotas) {
            if (patFloat.matcher(nota).matches()) {
                total += Float.parseFloat(nota);
                cont++;
            }
        }
        return total / cont;
    }
}
