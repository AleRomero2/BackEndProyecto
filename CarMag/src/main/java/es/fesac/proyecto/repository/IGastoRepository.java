package es.fesac.proyecto.repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import es.fesac.proyecto.model.Cliente;
import es.fesac.proyecto.model.Gasto;

public interface IGastoRepository extends CrudRepository<Gasto,Long>{

	List<Gasto> findAll();
	Optional<Gasto> findById(Long id);
	Gasto findByFecha(Date fecha);
	Gasto findByTitulo(String titulo);
	//Gasto findByCliente_id(Long id);
	//Gasto findBycliente_id(Cliente client);
	
	/*@Query(
			  value = "SELECT u FROM Gasto u WHERE u.cliente_id=:client_id", 
			  nativeQuery = true)
			List<Gasto> findBycliente_id(@Param("client_id")Long client);*/
}
