package es.fesac.proyecto.service;

import java.sql.Date;
import java.util.List;
import es.fesac.proyecto.model.Trayecto;


public interface ITrayectoService {
	List<Trayecto> findAll();
	
	Trayecto findById(Long id);

	Trayecto save(Trayecto trayec);

	void delete(Long id);
	
	Trayecto findByTrayectoMotivo(String motivo);
}
