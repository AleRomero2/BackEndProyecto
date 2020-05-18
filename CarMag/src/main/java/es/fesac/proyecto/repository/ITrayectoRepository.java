package es.fesac.proyecto.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import es.fesac.proyecto.model.Trayecto;

public interface ITrayectoRepository extends CrudRepository<Trayecto,Long>{
	List<Trayecto> findAll();
	
	Optional<Trayecto> findById(Long id);
	
	Trayecto findByMotivo(String motivo);
}
