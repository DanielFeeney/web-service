package br.edu.ifms.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class Cliente {
	private List<Cachorro> cachorros = new ArrayList<Cachorro>();
    private String nome;
    private String cidade;
    private String rua;
    private int idCliente;
    private String cpf;
    
    /*
     * Recebe um produto de cada vez e adiciona no
     * Carrinho e retorna o mesmo.
     */
    public Cliente adiciona(Cachorro cachorro) {
    	cachorros.add(cachorro);
    	return this;
    }
    
    /*
     * Este metodo será utilizado para popular os atributos
     * rua e cidade
     */
    public Cliente para (String rua, String cidade) {
    	this.rua = rua;
    	this.cidade = cidade;
    	return this;
    }

	

	public List<Cachorro> getCachorros() {
		return cachorros;
	}

	public void setCachorros(List<Cachorro> cachorros) {
		this.cachorros = cachorros;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cliente setId(int id) {
		this.idCliente = id;
		return this;
	}
    
    public String toXML() {
    	return new XStream().toXML(this);
    }
    
}