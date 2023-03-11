package repository;

import org.springframework.stereotype.Repository;
import model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
