package br.ufpr.tcc.repository;

import org.springframework.data.jpa.repository.*;

import br.ufpr.tcc.model.Usuario;






public interface TipoUsuarioRepository extends JpaRepository<Usuario, String>{

}
