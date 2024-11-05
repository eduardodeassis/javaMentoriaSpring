package com.javacalcularmedia.javaMentoriaSpring.controlador;

import com.javacalcularmedia.javaMentoriaSpring.entidade.Aluno;
import com.javacalcularmedia.javaMentoriaSpring.servico.MediaServico;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/media")
public class MediaControlador {

    @Autowired
    private MediaServico mediaServico;

    @GetMapping("/ola")
    public ResponseEntity<String> ola() {
        return ResponseEntity.ok("Olá, Mundo!"); 
        // return responseEntity
    }

    @GetMapping("/olaComNome/{nome}")
    public String olaComNome(@PathVariable String nome) {
        return "Olá, " + nome + "!";
    }

    @PostMapping
    public String testeAlunoPost(@RequestBody Aluno body) {
        return mediaServico.verificarAprovacao(body);
    }
}