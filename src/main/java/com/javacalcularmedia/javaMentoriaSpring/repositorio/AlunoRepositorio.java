package com.javacalcularmedia.javaMentoriaSpring.repositorio;

import com.javacalcularmedia.javaMentoriaSpring.entidade.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long>  {
}
