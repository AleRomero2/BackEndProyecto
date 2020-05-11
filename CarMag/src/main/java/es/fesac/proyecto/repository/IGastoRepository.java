package es.fesac.proyecto.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import es.fesac.proyecto.model.Gasto;

public interface IGastoRepository extends CrudRepository<Gasto,Long>{
	List<Gasto> findAll();
	
	Optional<Gasto> findById(Long id);
	
	Gasto findByGastoFecha(Date fecha);
	
	Gasto findByGastoTitulo(String titulo);
}
