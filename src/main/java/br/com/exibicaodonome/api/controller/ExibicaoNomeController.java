package br.com.exibicaodonome.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meu-nome")
public class ExibicaoNomeController {

    @GetMapping
    @ResponseStatus
    public String exibitNome() {
        return "Leonardo Santos de Lima";
    }
}
