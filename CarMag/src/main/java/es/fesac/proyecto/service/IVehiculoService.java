package es.fesac.proyecto.service;

import java.util.List;

import es.fesac.proyecto.model.Vehiculo;

public interface IVehiculoService {
	
	List<Vehiculo> findAll();
	
	Vehiculo findById(Long id);

	Vehiculo save(Vehiculo vehi);

	void delete(Long id);

	Vehiculo findByConsumo(String userId);
	
	Vehiculo findByCarburante(String userId);

}
