package com.javacalcularmedia.javaMentoriaSpring.controlador;

import com.javacalcularmedia.javaMentoriaSpring.entidade.Aluno;
import com.javacalcularmedia.javaMentoriaSpring.servico.AlunoServico;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public record AlunoControlador (AlunoServico alunoServico) {

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) {
        return alunoServico.salvar(aluno);
    }

    @GetMapping("/listar")
    public List<Aluno> listarAlunos() {
        return alunoServico.listarAlunos();
    }

    @GetMapping("/media")
    public String mediaAlunos() {

       return alunoServico.verificaMediaAlunos();
    }

}
