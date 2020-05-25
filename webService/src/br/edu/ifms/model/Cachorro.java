package br.edu.ifms.model;

public class Cachorro {
	
	private String nome;
	
	private int idCachorro;
	
	private String raca;
	
	private String servicoPet;
	
	private double valorServicoPet;
	
	public Cachorro(
			String nome, 
			int idCachorro, 
			String raca, 
			String servicoPet,
			double valorServicoPet) {
		this.nome = nome;
		this.idCachorro = idCachorro;
		this.raca = raca;
		this.servicoPet = servicoPet;		
		this.valorServicoPet = valorServicoPet;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdCachorro() {
		return idCachorro;
	}

	public void setIdCachorro(int idCachorro) {
		this.idCachorro = idCachorro;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getServicoPet() {
		return servicoPet;
	}

	public void setServicoPet(String servicoPet) {
		this.servicoPet = servicoPet;
	}

	public double getValorServicoPet() {
		return valorServicoPet;
	}

	public void setValorServicoPet(double valorServicoPet) {
		this.valorServicoPet = valorServicoPet;
	}
}