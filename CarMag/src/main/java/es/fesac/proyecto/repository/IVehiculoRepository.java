package es.fesac.proyecto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import es.fesac.proyecto.model.Vehiculo;

public interface IVehiculoRepository extends CrudRepository<Vehiculo,Long>{
		
		List<Vehiculo> findAll();
		
		Optional<Vehiculo> findById(Long id);

		Vehiculo findByCarName(String userId);
		
		Vehiculo findByCarModel(String userId);
}
