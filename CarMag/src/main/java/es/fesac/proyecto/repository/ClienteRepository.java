package es.fesac.proyecto.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import es.fesac.proyecto.model.Cliente;


public interface ClienteRepository extends CrudRepository<Cliente,Long>{
	Cliente findById(String nu);
    Optional<Cliente> findById(Long id);
    boolean existsById(String nu);
    boolean existsByEmail(String email);
    boolean existsByNombre(String nombre);
    boolean existsByEmailAndPsw(String email,String psw);
}
