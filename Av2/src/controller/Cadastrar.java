package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Contato;

public class Cadastrar {
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Fernando Camilo");
		contato.setEmail("contato@fernandocamilo.com");
		contato.setEndereco("Rua X - Rio de Janeiro");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(contato);
		manager.getTransaction().commit();
		
		System.out.println("Contato cadastrado com sucesso!" + contato.getId());
		
		manager.close();
		
	}
	
	public static Contato cadastrarContato(Contato contato) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(contato);
		manager.getTransaction().commit();
		manager.close();
		return contato;
	}

}
