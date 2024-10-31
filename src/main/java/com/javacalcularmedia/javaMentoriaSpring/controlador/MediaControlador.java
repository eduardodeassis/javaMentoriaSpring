package com.javacalcularmedia.javaMentoriaSpring.controlador;

import com.javacalcularmedia.javaMentoriaSpring.entidade.Aluno;
import com.javacalcularmedia.javaMentoriaSpring.servico.MediaServico;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController()
@RequestMapping(value = "/ex", method = POST)
public class MediaControlador {

    private MediaServico mediaServico;

    public MediaControlador(MediaServico mediaServico) {
        this.mediaServico = mediaServico;
    }

    @RequestMapping(value = "/ola", method = GET)
    public String ola() {
        return "Olá, Mundo!";
    }

    @RequestMapping(value = "/olaComNome{nome}", method = GET)
    public String olaComNome(@PathVariable("nome") String nome) {
        return "Olá, " + nome + "!";
    }

    @RequestMapping(method = POST)
    public String testeAlunoPost(@RequestBody Aluno body) {
        return mediaServico.showAluno(body);
    }
}