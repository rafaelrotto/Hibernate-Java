package br.unicentro.TrabFinal;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Endereco end = new Endereco ("Rua XV de Novembro", "5326", "Alto da XV", "Guarapuava");
    	Nota nota1 = new Nota ("1", "90", "10");
    	Nota nota2 = new Nota ("2", "70", "14");
    	Disciplina disciplina1 = new Disciplina ("506", "Banco de Dados 3", nota1);
    	Disciplina disciplina2 = new Disciplina ("305", "Inteligência Artificial", nota2);
    	Aluno aluno = new Aluno ("Rafael Roesler Otto", "09/09/1998", "Masculino", "101.696.149-99", "570161418", end, nota1);
    	Telefone tel1 = new Telefone ("(42)", "984219167", "Celular");
    	Telefone tel2 = new Telefone ("(42)", "36234079", "Fixo");
    	
    	
    	tel1.setAluno(aluno);
    	tel2.setAluno(aluno);
		List<Telefone> telefones = new ArrayList<Telefone>();
		telefones.add(tel1);
		telefones.add(tel2);
		aluno.setTelefones(telefones);
		
		
		@SuppressWarnings("deprecation")
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	Session session =  sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    		session.save(end);
    		session.save(aluno);	
    		session.save(tel1);
    		session.save(tel2);
    		session.save(disciplina1);
    		session.save(disciplina2);
    		session.save(nota1);
    		session.save(nota2);
    		
    		
    	tx.commit();
    	session.close();
    	sessionFactory.close();
    	
    }
}
