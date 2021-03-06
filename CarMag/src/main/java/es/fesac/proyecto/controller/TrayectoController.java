package es.fesac.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fesac.proyecto.model.Trayecto;
import es.fesac.proyecto.service.ITrayectoService;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/trayecto")
public class TrayectoController {
	@Autowired 
	ITrayectoService trayectoServ;
	
	@GetMapping(path = "/")
	public ResponseEntity<Iterable<Trayecto>> getAllVehiculo() {
	return ResponseEntity.ok(trayectoServ.findAll());
	}
	@PostMapping(path = "/add")
	public ResponseEntity<Trayecto> addNewVehiculo(@RequestBody Trayecto vehi) {
		
	return ResponseEntity.ok(trayectoServ.save(vehi));
	}
}
