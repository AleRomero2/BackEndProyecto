package es.fesac.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fesac.proyecto.model.Vehiculo;
import es.fesac.proyecto.repository.IVehiculoRepository;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/vehiculo")
public class VehiculoController {
	@Autowired 
	IVehiculoRepository vehiculoRepo;
	
	@GetMapping(path = "/")
	public ResponseEntity<Iterable<Vehiculo>> getAllVehiculo() {
	return ResponseEntity.ok(vehiculoRepo.findAll());
	}
	@PostMapping(path = "/add")
	public ResponseEntity<Vehiculo> addNewVehiculo(@RequestBody Vehiculo vehi) {
		
	return ResponseEntity.ok(vehiculoRepo.save(vehi));
	}
}
