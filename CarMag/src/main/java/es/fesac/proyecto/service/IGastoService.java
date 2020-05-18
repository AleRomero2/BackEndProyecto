package es.fesac.proyecto.service;

import java.util.List;

import es.fesac.proyecto.model.Cliente;
import es.fesac.proyecto.model.Gasto;


public interface IGastoService {
	
	List<Gasto> findAll();
	
	Gasto findById(Long id);

	Gasto save(Gasto gasto);

	void delete(Long id);
	
	//Gasto findByGastoFecha(Date fecha);
	
	Gasto findByGastoTitulo(String titulo);
	
	//Gasto findBycliente_id(Cliente client);

	//Gasto findByCliente_id(Long client);
}
