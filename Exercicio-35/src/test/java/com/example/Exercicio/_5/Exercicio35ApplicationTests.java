package com.example.Exercicio._5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Exercicio35Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercicio35Application.class, args);
    }

    // Aluno
    @GetMapping("/aluno")
    public String aluno() {
        return "Nome: João da Silva\nCurso: Sistemas de Informação";
    }

    //  Professor
    @GetMapping("/professor")
    public String professor() {
        return "Professor: Ana Paula Canal\nDisciplina: Sistemas Operacionais";
    }

    // Calculadora
    @GetMapping("/calculadora")
    public String calculadora(@RequestParam double a,
                              @RequestParam double b,
                              @RequestParam String operacao) {
        switch (operacao) {
            case "soma":
                return "Resultado: " + (a + b);
            case "subtracao":
                return "Resultado: " + (a - b);
            case "multiplicacao":
                return "Resultado: " + (a * b);
            case "divisao":
                if (b == 0) return "Erro: divisão por zero!";
                return "Resultado: " + (a / b);
            default:
                return "Operação inválida!";
        }
    }
}
