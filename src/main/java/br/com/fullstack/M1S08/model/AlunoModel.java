package br.com.fullstack.M1S08.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;


@Data
public class AlunoModel {

    // Início da contagem de ID's
    private static Integer proximoId = 1;

    // Atributos
    @Setter(AccessLevel.NONE) private Integer id;
    private String nome;
    private LocalDate dataNascimento;

    // Método estático para controlar a sequência de ID's
    private Integer getProximoId(){
        return proximoId++;
    }
}
