package es.fesac.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fesac.proyecto.model.Mantenimiento;
import es.fesac.proyecto.service.IMantenimientoService;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/mantenimiento")
public class MantenimientoController {
	@Autowired 
	IMantenimientoService mantenimientoServ;
	
	@GetMapping(path = "/")
	public ResponseEntity<Iterable<Mantenimiento>> getAllVehiculo() {
	return ResponseEntity.ok(mantenimientoServ.findAll());
	}
	@PostMapping(path = "/add")
	public ResponseEntity<Mantenimiento> addNewVehiculo(@RequestBody Mantenimiento vehi) {
		
	return ResponseEntity.ok(mantenimientoServ.save(vehi));
	}
}
