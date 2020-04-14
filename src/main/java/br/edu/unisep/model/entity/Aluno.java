package br.edu.unisep.model.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "evaluation")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evaluation")
    private Integer id_aluno;
    @Column(name = "student_name")
    private String aluno;
    @Column(name = "grade_presentation")
    private Double n_apresentacao;
    @Column(name = "grade_language")
    private Double n_linguagem;
    @Column(name = "grade_proposal")
    private Double n_proposta;
    @Column(name = "grade_results")
    private Double n_resultados;
    @Column(name = "grade_evaluation")
    private Double n_notaFinal;


    public Double notaFinal(){
        return  this.n_notaFinal=(this.n_resultados+this.n_apresentacao+this.n_linguagem+this.n_proposta);
    }
}
