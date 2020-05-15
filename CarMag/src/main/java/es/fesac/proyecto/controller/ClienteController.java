package es.fesac.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fesac.proyecto.model.Cliente;
import es.fesac.proyecto.repository.ClienteRepository;
//import es.fesac.proyecto.service.IClienteService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {
	@Autowired 
	ClienteRepository clienteRepo;
	
	@GetMapping(path = "/")
	public ResponseEntity<Iterable<Cliente>> getAllClient() {
	return ResponseEntity.ok(clienteRepo.findAll());
	}
	@PostMapping(path = "/add")
	public ResponseEntity<Cliente> addNewCliente(@RequestBody Cliente nueva) {
	clienteRepo.save(nueva);
	return ResponseEntity.ok(nueva);
	}
	@GetMapping(path = "/findbycliente")
	public ResponseEntity<Cliente> getClienteByEmail(@RequestBody String email) {
		Cliente paco=clienteRepo.findByEmail(email.toString());
		return ResponseEntity.ok(paco);
	}
}
