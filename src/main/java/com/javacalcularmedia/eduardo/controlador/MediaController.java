package com.javacalcularmedia.eduardo.controlador;

import com.javacalcularmedia.eduardo.entidade.Usuario;
import com.javacalcularmedia.eduardo.servico.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController()
public class MediaController {

    private MediaService mediaService;

    public MediaController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    @Autowired

    @GetMapping("/ola")
    public String ola() {
        return "Olá, Mundo!";
    }

    @GetMapping("/ola2/{nome}")
    public String olaComNome(@PathVariable String nome) {
        return "Olá, " + nome + "!";
    }

    @PostMapping("")
    public String testeUsuarioPost(@RequestBody Usuario body) {
        return mediaService.showUsuario(body);
                //"Olá, " + body.getNome() + "!"; // " de " + String.valueOf(xTeste.idade) + "!";
    }
}