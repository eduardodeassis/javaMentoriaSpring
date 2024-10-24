package com.javacalcularmedia.eduardo.controlador;

import com.javacalcularmedia.eduardo.entidade.Aluno;
import com.javacalcularmedia.eduardo.servico.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController()
public class MediaController {

    private MediaService mediaService;

    public MediaController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    @GetMapping("/ola")
    public String ola() {
        return "Olá, Mundo!";
    }

    @GetMapping("/ola2/{nome}")
    public String olaComNome(@PathVariable String nome) {
        return "Olá, " + nome + "!";
    }

    @PostMapping("")
    public String testeUsuarioPost(@RequestBody Aluno body) {
        return mediaService.showAluno(body);
    }
}