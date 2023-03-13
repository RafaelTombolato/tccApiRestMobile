package dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {
	
	
		private int id;
	    private String nomeUsuario;
	    private String cpf;
	    private String telefone;
	    private String email;
	    private String senha;
	    private boolean bloqueio;
	    private TipoUsuarioDTO tipoUsuario;
	    private EspecialidadeDTO especialidade;
	    
	    
	    
		public UsuarioDTO() {
			super();
			// TODO Auto-generated constructor stub
		}



		public UsuarioDTO(int id, String nomeUsuario, String cpf, String telefone, String email, String senha,
				boolean bloqueio, TipoUsuarioDTO tipoUsuario, EspecialidadeDTO especialidade) {
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



		public TipoUsuarioDTO getTipoUsuario() {
			return tipoUsuario;
		}



		public void setTipoUsuario(TipoUsuarioDTO tipoUsuario) {
			this.tipoUsuario = tipoUsuario;
		}



		public EspecialidadeDTO getEspecialidade() {
			return especialidade;
		}



		public void setEspecialidade(EspecialidadeDTO especialidade) {
			this.especialidade = especialidade;
		}

		
		
	
	
	

}
