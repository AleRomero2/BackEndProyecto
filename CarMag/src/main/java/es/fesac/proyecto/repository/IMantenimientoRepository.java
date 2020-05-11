package es.fesac.proyecto.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import es.fesac.proyecto.model.Mantenimiento;


public interface IMantenimientoRepository extends CrudRepository<Mantenimiento,Long>{
	List<Mantenimiento> findAll();
	
	Optional<Mantenimiento> findById(Long id);

	Mantenimiento findByMantenimientoTipo(String userId);
	
	Mantenimiento findByMantenimientoLocalizacion(String userId);
}
