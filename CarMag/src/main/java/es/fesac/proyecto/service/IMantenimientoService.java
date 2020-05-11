package es.fesac.proyecto.service;

import java.util.List;

import es.fesac.proyecto.model.Mantenimiento;


public interface IMantenimientoService {
	List<Mantenimiento> findAll();
	
	Mantenimiento findById(Long id);

	Mantenimiento save(Mantenimiento mante);

	void delete(Long id);

	Mantenimiento findByMantenimientoTipo(String userId);
	
	Mantenimiento findByMantenimientoLocalizacion(String userId);
}
