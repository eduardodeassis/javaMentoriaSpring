package com.javacalcularmedia.eduardo.servico;

import com.javacalcularmedia.eduardo.entidade.Usuario;
import org.springframework.stereotype.Service;

@Service
public class MediaService {

    public String showUsuario(Usuario usuario) {
        return "Usuario: " + usuario.getNome();
    }

}
