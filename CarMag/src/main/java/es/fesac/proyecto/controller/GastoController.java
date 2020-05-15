package es.fesac.proyecto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import es.fesac.proyecto.model.Cliente;
import es.fesac.proyecto.model.Gasto;
import es.fesac.proyecto.repository.IGastoRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/gasto")
public class GastoController {
	@Autowired 
	IGastoRepository gastoRepo;
	
	@PostMapping(path = "/getGasto")
	public ResponseEntity<Gasto> getGastoByCliente(@RequestBody Cliente client) {
	return ResponseEntity.ok(gastoRepo.findByCliente(client));
	}
	@PostMapping(path = "/add")
	public ResponseEntity<Gasto> addNewGasto(@RequestBody Gasto gasto) {
	return ResponseEntity.ok(gastoRepo.save(gasto));
	}
}
