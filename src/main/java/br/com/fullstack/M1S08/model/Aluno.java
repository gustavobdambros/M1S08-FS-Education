package br.com.fullstack.M1S08.model;

import java.time.LocalDate;

public class Aluno {

    // Início da contagem de ID's
    private static int proximoID = 1;

    // Atributos
    private final int id;
    private String nome;
    private LocalDate dataNascimento;

    public Aluno(String nome, LocalDate dataNascimento) {
        this.id = proximoID++;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    //Método estático para controlar a sequência de ID's
    public static void controleID(int proximoID){
        Aluno.proximoID = proximoID;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
