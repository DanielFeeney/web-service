package br.edu.ifms.dao;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifms.model.Cachorro;
import br.edu.ifms.model.Cliente;


public class ClienteDao {
	
	private static Map<Long, Cliente> banco = 
			           new HashMap<Long, Cliente>();
	
	static {
		
		Cachorro cachorro1 = new Cachorro("Rex", 1, "Dalmata", "Banho e Tosa", 20);
		Cachorro cachorro2 = new Cachorro("Rintintin", 2, "Pastor Alemão", "Banho", 10);
		
		Cliente carrinho = new Cliente("588.179.410-93")
				                          .adiciona(cachorro1)
				                          .adiciona(cachorro2)
				                          .para("Rua Afonso Pena, 2345",
				                        		  "Campo Grande")
				                          .setId(1);
		banco.put(1l, carrinho);
		
		
	}
	
	public Cliente busca(Long id) {
		return banco.get(id);
	}
	
	

}