package br.com.fullstack.M1S08.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class AlunoModel {

    // Início da contagem de ID's
    private static Integer proximoId = 1;
    @Getter private static List<AlunoModel> alunos = new ArrayList<>();

    // Atributos
    @Setter(AccessLevel.NONE) private Integer id;
    private String nome;
    private LocalDate dataNascimento;

    // Método estático para controlar a sequência de ID's
    private static Integer getProximoId(){
        return proximoId++;
    }

    public static AlunoModel inserir(AlunoModel aluno) {
        aluno.id = getProximoId();
        alunos.add(aluno);
        return aluno;
    }
}
