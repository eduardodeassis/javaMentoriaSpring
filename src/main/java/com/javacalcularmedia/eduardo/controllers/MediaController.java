package com.javacalcularmedia.eduardo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController()
public class MediaController {
    @GetMapping("/ola")
    public String ola() {
        return "Olá, Mundo!";
    }
    @GetMapping("/ola2/{nome}")
    public String olaComNome(@PathVariable String nome) {
        return "Olá, " + nome + "!";
    }
    @PostMapping("/usuario}")
    public String testeUsuario(@RequestBody Usuario usuario) {
        return "Olá, " + usuario.nome + "!"; // " de " + String.valueOf(xTeste.idade) + "!";
    }
}

public class Usuario {
    private String nome;
    private int idade;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
