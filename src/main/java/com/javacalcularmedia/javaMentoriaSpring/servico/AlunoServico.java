package com.javacalcularmedia.javaMentoriaSpring.servico;

import com.javacalcularmedia.javaMentoriaSpring.entidade.Aluno;
import com.javacalcularmedia.javaMentoriaSpring.repositorio.AlunoRepositorio;
import org.springframework.stereotype.Service;

@Service
public record AlunoServico(AlunoRepositorio alunoRepositorio) {
    public Aluno salvar(Aluno aluno) {
        return alunoRepositorio.save(aluno);
    }
}
