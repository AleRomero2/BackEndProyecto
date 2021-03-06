package es.fesac.proyecto.controller;


import java.util.List;

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
import es.fesac.proyecto.model.Gasto;
import es.fesac.proyecto.service.IGastoService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/gasto")
public class GastoController {
	@Autowired 
	IGastoService gastoServ;
	
	@GetMapping(path = "/getGasto")
	public ResponseEntity<List<Gasto>>  getGastoByCliente() {
	return ResponseEntity.ok(gastoServ.findAll());
	}
	@PostMapping(path = "/add")
	public ResponseEntity<Gasto> addNewGasto(@RequestBody Gasto gasto) {
	return ResponseEntity.ok(gastoServ.save(gasto));
	}
}
