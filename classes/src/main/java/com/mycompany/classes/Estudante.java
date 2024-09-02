package com.mycompany.classes;

import java.util.ArrayList;
import java.util.List;

public class Estudante {

    private String Nome;
    private int Idade;
    private List<String> Disciplinas;

     // Construtor
    public Estudante(String nome, int idade) {
        this.Nome = nome;
        this.Idade = idade;
        this.Disciplinas = new ArrayList<>();
    }

    public Estudante(String nome, int idade, List<String> disciplinas) {
        this.Nome = nome;
        this.Idade = idade;
        this.Disciplinas = disciplinas != null ? disciplinas : new ArrayList<>();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        this.Idade = idade;
    }

    public List<String> getDisciplinas() {
        return Disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.Disciplinas = disciplinas;
    }

    public void AddDisciplina(String disciplina) {
        Disciplinas.add(disciplina);
        System.out.println("Disciplina " + disciplina + " adicionada com sucesso.");
    }

    public void ExbDisciplinas() {
        System.out.println("Disciplinas matriculadas para " + Nome + ":");
        for (String disciplina : Disciplinas) {
            System.out.println("- " + disciplina);
        }
    }
}
