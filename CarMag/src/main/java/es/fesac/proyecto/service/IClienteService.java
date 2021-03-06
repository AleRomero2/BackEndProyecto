package es.fesac.proyecto.service;

import java.util.List;

import es.fesac.proyecto.model.Cliente;

public interface IClienteService {

	List<Cliente> findAll();

	Cliente findById(Long id);

	Cliente save(Cliente user);
	
	public Cliente findByEmail(String email);
	
	void delete(Long id);

	Cliente findByUserId(String userId);

	boolean existsByEmail(String email);

	boolean existsByNombre(String nombre);
	
	boolean existsByEmailAndPsw(String email,String psw);
}