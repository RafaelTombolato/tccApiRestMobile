package br.ufpr.tcc.dto;

import java.io.Serializable;

public class EspecialidadeDTO implements Serializable {
	
	private int id;
    private String nome;
    
    
	public EspecialidadeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EspecialidadeDTO(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	

}
