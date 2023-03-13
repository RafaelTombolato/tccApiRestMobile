package br.ufpr.tcc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;






@Entity
@Table(name="tb_usuario")


public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome")	
    private String nomeUsuario;
		
	@Column(name="cpf")
    private String cpf;
	
	@Column(name="telefone")
    private String telefone;
    
	@Column(name="email")
    private String email;
    
	@Column(name="senha")
    private String senha;
    
	@Column(name="bloqueio")
    private boolean bloqueio;
    
	@Column(name="tipo_usuario_id")
    private int tipo_usuario_id;
    
	@Column(name="especialidade_id")
    private int especialidade_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isBloqueio() {
		return bloqueio;
	}

	public void setBloqueio(boolean bloqueio) {
		this.bloqueio = bloqueio;
	}

	public int getTipo_usuario_id() {
		return tipo_usuario_id;
	}

	public void setTipo_usuario_id(int tipo_usuario_id) {
		this.tipo_usuario_id = tipo_usuario_id;
	}

	public int getEspecialidade_id() {
		return especialidade_id;
	}

	public void setEspecialidade_id(int especialidade_id) {
		this.especialidade_id = especialidade_id;
	}

	public Usuario(int id, String nomeUsuario, String cpf, String telefone, String email, String senha,
			boolean bloqueio, int tipo_usuario_id, int especialidade_id) {
		super();
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.bloqueio = bloqueio;
		this.tipo_usuario_id = tipo_usuario_id;
		this.especialidade_id = especialidade_id;
	}

	public Usuario() {
		super();
	}

	
	
	
	

}
