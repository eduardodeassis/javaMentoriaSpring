package com.javacalcularmedia.eduardo.servico;

import com.javacalcularmedia.eduardo.entidade.Aluno;
import org.springframework.stereotype.Service;

@Service
public class MediaService {

    public String showAluno(Aluno aluno) {
       float media = aluno.getMedia();
       String status = "";
       if (media < 6) {
           status = "O aluno foi reprovado!";
       }
       else {
           status = "O aluno foi aprovado!";
       }

       return String.format("Aluno: %s\nMédia: %.2f\n%s"
               , aluno.getNome(), media, status);
    }

}
