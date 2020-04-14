package br.edu.unisep.usecase;

import br.edu.unisep.model.dao.AlunoDao;
import br.edu.unisep.model.entity.Aluno;

public class DeletarAlunoUseCase {
    public void execute(Aluno aluno){
        AlunoDao dao = new AlunoDao();
        dao.deletar(aluno);

    }
}
