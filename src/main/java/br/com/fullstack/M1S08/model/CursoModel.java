package br.com.fullstack.M1S08.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class CursoModel {

    // Início da contagem de ID's
    private static Integer proximoId = 1;
    @Getter private static List<CursoModel> cursos = new ArrayList<>();

    // Atributos
    @Setter(AccessLevel.NONE) private Integer id;
    private String nome;
    private String descricao;
    private Integer cargaHoraria;

    // Método para controlar a sequência de ID's
    private static Integer getProximoId(){
        return proximoId++;
    }

    public static CursoModel inserir(CursoModel curso) {
        curso.id = getProximoId();
        cursos.add(curso);
        return curso;
    }
}
