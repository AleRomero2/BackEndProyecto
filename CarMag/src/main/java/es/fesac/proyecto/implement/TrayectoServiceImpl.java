package es.fesac.proyecto.implement;

import java.sql.Date;
import java.util.List;

import es.fesac.proyecto.model.Trayecto;
import es.fesac.proyecto.repository.ITrayectoRepository;
import es.fesac.proyecto.service.ITrayectoService;

public class TrayectoServiceImpl implements ITrayectoService{
	private ITrayectoRepository trayectoDado;
	@Override
	public List<Trayecto> findAll() {
		return (List<Trayecto>) trayectoDado.findAll();
	}

	@Override
	public Trayecto findById(Long id) {
		return trayectoDado.findById(id).get();
	}

	@Override
	public Trayecto save(Trayecto trayec) {
		return trayectoDado.save(trayec);
	}

	@Override
	public void delete(Long id) {
		trayectoDado.deleteById(id);
	}

	@Override
	public Trayecto findByTrayectoFecha(Date fecha) {
		return trayectoDado.findByFecha(fecha);
	}

	@Override
	public Trayecto findByTrayectoMotivo(String motivo) {
		return trayectoDado.findByMotivo(motivo);
	}

}
