package com.javacalcularmedia.javaMentoriaSpring.servico;

import com.javacalcularmedia.javaMentoriaSpring.entidade.Aluno;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class MediaServico {

    final Pattern patFloat = Pattern.compile("^-?\\d+(\\.\\d+)?$");

    public float getMedia(Aluno aluno) {
        String[] splitNotas = aluno.getNotas().replace(" ", "").replace(",", ".").split(";");
        float total = 0;
        int cont = 0;
        for (String nota : splitNotas) {
            if (patFloat.matcher(nota).matches()) {
                total += Float.parseFloat(nota);
                cont++;
            }
        }
        return total / cont;
    }


    // cuidado com nomes em ingles, por causa da publicenter
    public String verificarAprovacao(Aluno aluno) {
       float media = getMedia(aluno);
       String status = "";
       if (media < 6) {
           status = "O aluno foi reprovado!";
       }
       else {

           status = "O aluno foi aprovado!";
       }

       return String.format("Aluno: %s\nMédia: %.2f\n%s", aluno.getNome(), media, status);
    }

}
