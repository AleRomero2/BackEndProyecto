package es.fesac.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fesac.proyecto.model.Cliente;
import es.fesac.proyecto.repository.ClienteRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {
	@Autowired private ClienteRepository clienteRepo;
	
	@GetMapping(path = "/")
	public ResponseEntity<Iterable<Cliente>> getAllClient() {
	return ResponseEntity.ok(clienteRepo.findAll());
	}
	@PostMapping(path = "/add")
	public ResponseEntity<Cliente> addNewSala(@RequestBody Cliente nueva) {
	clienteRepo.save(nueva);
	return ResponseEntity.ok(nueva);
	}
}
