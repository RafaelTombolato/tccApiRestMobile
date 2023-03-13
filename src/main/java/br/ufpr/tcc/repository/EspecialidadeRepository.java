package br.ufpr.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.*;

import br.ufpr.tcc.model.Especialidade;
import br.ufpr.tcc.model.Usuario;






public interface EspecialidadeRepository extends JpaRepository<Usuario, String> {
	
	
	
	public List<Especialidade> findAllById(Long id);
	

}
