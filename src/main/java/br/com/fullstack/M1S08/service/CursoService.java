package br.com.fullstack.M1S08.service;

import br.com.fullstack.M1S08.model.CursoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    public List<CursoModel> buscarTodos() {
        return CursoModel.getCursos();
    }

    public CursoModel salvar(CursoModel curso) throws Exception {
        if(!validar(curso)) {
            return null;
        }
        return CursoModel.inserir(curso);
    }

    private boolean validar(CursoModel curso) throws Exception {
        if(curso.getNome() == null || curso.getNome().isBlank()){
            throw new Exception("Nome é obrigatório!");
        }

        if (curso.getCargaHoraria() == null) {
            throw new Exception("Carga horária é obrigatório!");
        }

        return true;
    }
}


