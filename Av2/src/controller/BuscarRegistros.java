package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Contato;

public class BuscarRegistros {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		String sql = "From model.Contato";
		
		Query query = manager.createQuery(sql);
	        
		List<Contato> Lista = query.getResultList();
		
		for (Contato c : Lista) {
			System.out.println("ID: " + c.getId());
			System.out.println("Nome: " + c.getNome());
			System.out.println("Nome: " + c.getEmail() + "\n");
		}
		
		manager.close();
	}
	
	public static void listarRegistros() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		String sql = "From model.Contato";
		
		Query query = manager.createQuery(sql);
	        
		List<Contato> Lista = query.getResultList();
		
		for (Contato c : Lista) {
			System.out.println("ID: " + c.getId());
			System.out.println("Nome: " + c.getNome());
			System.out.println("Email: " + c.getEmail());
			System.out.println("Endere�o: " + c.getEndereco());
			System.out.println("\n");
		}
		
		manager.close();
	}
	
}
