package br.ufpr.tcc.rest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dto.ClienteDTO;
import model.Cliente;
import repository.ClienteRepository;


@CrossOrigin
@RestController
public class ClienteREST {
	
	@Autowired
	private ClienteRepository ClienteRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	
	@PostMapping("/CadastroCliente")
	public ResponseEntity<ClienteDTO> cadastrar (@RequestBody ClienteDTO ClienteDTO){
		try {
			Cliente cliente = mapper.map(ClienteDTO, Cliente.class);
			cliente = ClienteRepo.save(cliente);
			ClienteDTO = mapper.map(cliente, ClienteDTO.class);
			return ResponseEntity.status(200).body(ClienteDTO);
		}
		catch (DataIntegrityViolationException e) {
			return ResponseEntity.status(409).build();
		}
	}

}
