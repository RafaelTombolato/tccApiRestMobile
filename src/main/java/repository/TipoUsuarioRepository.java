package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Usuario;




@Repository
public interface TipoUsuarioRepository extends JpaRepository<Usuario, String>{

}
