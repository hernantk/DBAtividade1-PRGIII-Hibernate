package br.edu.unisep.bean;

import br.edu.unisep.model.entity.Aluno;
import br.edu.unisep.usecase.DeletarAlunoUseCase;
import br.edu.unisep.usecase.InserirAlunoUseCase;
import br.edu.unisep.usecase.ListarAlunoUseCase;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class ListarAlunoBean {
    private ListarAlunoUseCase useCase= new ListarAlunoUseCase();
    private DeletarAlunoUseCase deletaruseCase=new DeletarAlunoUseCase();

    @Getter @Setter
    private List<Aluno> listaAlunos;


    @PostConstruct
    public void iniciar(){
        this.listaAlunos=useCase.executar();
    }

    public void delete(Aluno aluno){
        deletaruseCase.execute(aluno);
        iniciar();
    }
}
