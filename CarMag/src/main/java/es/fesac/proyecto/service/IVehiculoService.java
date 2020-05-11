package es.fesac.proyecto.service;

import java.util.List;

import es.fesac.proyecto.model.Vehiculo;

public interface IVehiculoService {
	
	List<Vehiculo> findAll();
	
	Vehiculo findById(Long id);

	Vehiculo save(Vehiculo vehi);

	void delete(Long id);

	Vehiculo findByCarName(String userId);
	
	Vehiculo findByCarModel(String userId);

}
