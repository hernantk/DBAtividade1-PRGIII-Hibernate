package br.edu.unisep.model.dao;

import br.edu.unisep.hibernate.HibernateSessionFactory;
import br.edu.unisep.model.entity.Aluno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDao {

    public List<Aluno> listarTodos(){
        var session= HibernateSessionFactory.getSession();
        var query=session.createQuery("from Aluno",Aluno.class);
        var result=query.list();



        return result;
    }
    public void salvar(Aluno aluno){
        var session= HibernateSessionFactory.getSession();
        var transaction = session.beginTransaction();
        try {
            session.save(aluno);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        session.close();
    }
    public void deletar(Aluno aluno){
        var session= HibernateSessionFactory.getSession();
        var transaction = session.beginTransaction();
        try {
            session.delete(aluno);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        session.close();
    }




}
