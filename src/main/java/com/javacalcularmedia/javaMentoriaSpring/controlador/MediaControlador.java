package com.javacalcularmedia.javaMentoriaSpring.controlador;

import com.javacalcularmedia.javaMentoriaSpring.entidade.Aluno;
import com.javacalcularmedia.javaMentoriaSpring.servico.MediaServico;
import org.springframework.web.bind.annotation.*;

@RestController()
public class MediaControlador {

    private MediaServico mediaServico;

    public MediaControlador(MediaServico mediaServico) {
        this.mediaServico = mediaServico;
    }

    //@GetMapping("/ola")
    public String ola() {
        return "Olá, Mundo!";
    }

    //@GetMapping("/olaComNome/{nome}")
    public String olaComNome(@PathVariable String nome) {
        return "Olá, " + nome + "!";
    }

    //@PostMapping("/media")
    public String testeAlunoPost(@RequestBody Aluno body) {
        return mediaServico.showAluno(body);
    }
}