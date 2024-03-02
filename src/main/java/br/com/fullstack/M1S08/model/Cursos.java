package br.com.fullstack.M1S08.model;

public class Cursos {

    // Início da contagem de ID's
    private static int proximoID = 1;

    // Atributos
    private int id;
    private String Nome;
    private String descricao;
    private int cargaHoraria;

    // Construtor
    public Cursos(String nome, String descricao, int cargaHoraria) {
        this.id = proximoID++;
        Nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    //Método estático para controlar a sequência de ID's
    public static void controleID(int proximoID){
        Cursos.proximoID = proximoID;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return Nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Verificar necessidade do toString
}
