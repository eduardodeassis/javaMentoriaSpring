package com.javacalcularmedia.javaMentoriaSpring.servico;

import com.javacalcularmedia.javaMentoriaSpring.entidade.Aluno;
import com.javacalcularmedia.javaMentoriaSpring.repositorio.AlunoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record AlunoServico(AlunoRepositorio alunoRepositorio) {
    public Aluno salvar(Aluno aluno) {
        return alunoRepositorio.save(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunoRepositorio.findAll();
    }

    public String verificaMediaAlunos() {
        MediaServico mediaServico = new MediaServico();
        String tmp = "";
        List<Aluno> alunos = listarAlunos();

        for (Aluno aluno : alunos) {
            tmp += String.format("%s\n\n", mediaServico.verificarAprovacao(aluno));
        }
        return tmp;
    }

}
