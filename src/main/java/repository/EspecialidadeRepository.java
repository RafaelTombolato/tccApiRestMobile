package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Especialidade;
import model.Usuario;



@Repository
public interface EspecialidadeRepository extends JpaRepository<Usuario, String> {
	
	
	
	public List<Especialidade> findAllById(Long id);
	

}
