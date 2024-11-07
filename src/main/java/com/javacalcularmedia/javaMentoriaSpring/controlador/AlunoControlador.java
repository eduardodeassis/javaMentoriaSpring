package com.javacalcularmedia.javaMentoriaSpring.controlador;

import com.javacalcularmedia.javaMentoriaSpring.entidade.Aluno;
import com.javacalcularmedia.javaMentoriaSpring.servico.AlunoServico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public record AlunoControlador (AlunoServico alunoServico) {

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) {
        return alunoServico.salvar(aluno);
    }

}
