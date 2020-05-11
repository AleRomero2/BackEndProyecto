package es.fesac.proyecto.implement;

import java.util.List;

import es.fesac.proyecto.model.Mantenimiento;
import es.fesac.proyecto.repository.IMantenimientoRepository;
import es.fesac.proyecto.service.IMantenimientoService;

public class MantenimientoServiceImpl implements IMantenimientoService{
	private IMantenimientoRepository mantenimientoDado;
	@Override
	public List<Mantenimiento> findAll() {
		return (List<Mantenimiento>) mantenimientoDado.findAll();
	}

	@Override
	public Mantenimiento findById(Long id) {
		return mantenimientoDado.findById(id).get();
	}

	@Override
	public Mantenimiento save(Mantenimiento mante) {
		return mantenimientoDado.save(mante);
	}

	@Override
	public void delete(Long id) {
		mantenimientoDado.deleteById(id);
	}

	@Override
	public Mantenimiento findByMantenimientoTipo(String tipo) {
		return mantenimientoDado.findByMantenimientoTipo(tipo);
	}

	@Override
	public Mantenimiento findByMantenimientoLocalizacion(String localizacion) {
		return mantenimientoDado.findByMantenimientoLocalizacion(localizacion);
	}

}
