package com.example.Exercicio._4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Exercicio34Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercicio34Application.class, args);
    }

    // Endpoint  de exemplo do prof André
    @GetMapping("/nome")
    public String nome() {
        return "João da Silva";
    }

    //  Endpoint CPF
    @GetMapping("/cpf")
    public String cpf() {
        return "123.456.789-00";
    }

    //  Endpoint Endereço
    @GetMapping("/endereco")
    public String endereco() {
        return "João da Silva - Rua das Flores, 123";
    }

    // Endpoint  Soma
    @GetMapping("/soma")
    public String soma(@RequestParam int a, @RequestParam int b) {
        return "Resultado: " + (a + b);
    }
}
