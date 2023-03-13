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
    private TipoUsuario tipoUsuario;
    
	@Column(name="especialidade_id")
    private Especialidade especialidade;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int id, String nomeUsuario, String cpf, String telefone, String email, String senha,
			boolean bloqueio, TipoUsuario tipoUsuario, Especialidade especialidade) {
		super();
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.bloqueio = bloqueio;
		this.tipoUsuario = tipoUsuario;
		this.especialidade = especialidade;
	}

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

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
	
	
	
	

}
