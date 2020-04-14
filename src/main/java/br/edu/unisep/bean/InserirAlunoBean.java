package br.edu.unisep.bean;

import br.edu.unisep.model.entity.Aluno;
import br.edu.unisep.usecase.DeletarAlunoUseCase;
import br.edu.unisep.usecase.InserirAlunoUseCase;
import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class InserirAlunoBean {
    private InserirAlunoUseCase inseriruseCase=new InserirAlunoUseCase();

    @Getter @Setter
    private Aluno aluno = new Aluno();



    public String inserir(){
        aluno.notaFinal();
        inseriruseCase.executar(this.aluno);
        return "index?faces-redirect=true";

    }

}
