package repository;

import org.springframework.stereotype.Repository;
import model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClienteRepository extends JpaRepository<Usuario, Long>{

}
