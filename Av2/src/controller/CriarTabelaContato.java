package controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriarTabelaContato {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		factory.close();

	}
}
