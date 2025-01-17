/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testehibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author taniabasso
 */
public class TesteHibernate2 {
    public static void main(String[] args) {
        
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
     
            //primeiro cria as disciplinas
            Disciplina disc1 = new Disciplina (1,"java", 80);
            Disciplina disc2 = new Disciplina (2, "estrutura de dados", 40);
            Disciplina disc3 = new Disciplina (3, "banco de dados", 40);
        
            //cria os alunos
            Aluno al1 =new Aluno(1234,"Tania");
            Aluno al2 =new Aluno(5678,"Leandro");
            Aluno al3 =new Aluno(9012,"Maria");

            //cria professores

            Professor p1 = new Professor(1, "Matioli",3000,8);
            Professor p2 = new Professor(2, "Priscila",27000,6);
            Professor p3 = new Professor(3, "Simone",30000,8);

            //cria cliente
            //Cliente c1 = new Cliente(1, "Gabriel", 17, 11);





                //salva alunos
           session.save(al1);
           session.save(al2);
           session.save(al3);

        session.save(disc1);
        session.save(disc2);
        session.save(disc3);

        session.save(p1);
        session.save(p2);
        session.save(p3);

        //session.save(p3);

           
        session.getTransaction().commit();
        


        session.close();
        HibernateUtil.shutdown();
    }
}
