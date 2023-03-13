package br.ufpr.tcc.rest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import dto.UsuarioDTO;
import model.Usuario;
import repository.UsuarioRepository;





@CrossOrigin
@RestController
public class UsuarioREST {
	
	@Autowired(required=true)
	private UsuarioRepository UsuarioRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	
	@PostMapping("/CadastroUsuario")
	public ResponseEntity<UsuarioDTO> cadastrar (@RequestBody UsuarioDTO UsuarioDTO){
		try {
			Usuario usuario = mapper.map(UsuarioDTO, Usuario.class);
			usuario = UsuarioRepo.save(usuario);
			UsuarioDTO = mapper.map(usuario, UsuarioDTO.class);
			return ResponseEntity.status(200).body(UsuarioDTO);
		}
		catch (DataIntegrityViolationException e) {
			return ResponseEntity.status(409).build();
		}
	}

}
