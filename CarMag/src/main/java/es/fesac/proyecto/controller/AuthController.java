package es.fesac.proyecto.controller;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fesac.proyecto.service.IClienteService;
import es.fesac.proyecto.model.Cliente;
import es.fesac.proyecto.repository.ClienteRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/Auth")


public class AuthController {

	@Autowired
	IClienteService usuarioService;
	
	@Autowired
	IClienteService newUsuario;



	@SuppressWarnings({ "rawtypes" })
	@PostMapping("/nuevo")
	
	public ResponseEntity<?> nuevo(@Valid @RequestBody Cliente nuevoUsuario, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		if (usuarioService.existsByNombre(nuevoUsuario.getNombre())) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		if (usuarioService.existsByEmail(nuevoUsuario.getEmail())) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		Cliente usuario = new Cliente(nuevoUsuario.getNombre(), nuevoUsuario.getPsw(),
				nuevoUsuario.getEmail());
		usuarioRepository.save(usuario);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@SuppressWarnings({ "rawtypes" })
	@PostMapping("/login")
	
	public ResponseEntity<?> login(@Valid @RequestBody Cliente nuevoUsuario, BindingResult bindingResult) {
		if(usuarioRepository.existsByEmailAndPsw(nuevoUsuario.getEmail(), nuevoUsuario.getPsw())) {
			return new ResponseEntity(HttpStatus.OK);
		}		
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
}
