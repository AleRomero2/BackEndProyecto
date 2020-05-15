package es.fesac.proyecto.implement;

import java.sql.Date;
import java.util.List;

import es.fesac.proyecto.model.Cliente;
import es.fesac.proyecto.model.Gasto;
import es.fesac.proyecto.repository.IGastoRepository;
import es.fesac.proyecto.service.IGastoService;


public class GastoServiceImpl implements IGastoService{
	
	private IGastoRepository gastoDado;
	@Override
	public List<Gasto> findAll() {
		return (List<Gasto>) gastoDado.findAll();
	}
	@Override
	public Gasto findById(Long id) {
		return gastoDado.findById(id).get();
	}
	@Override
	public Gasto save(Gasto gasto) {
		return gastoDado.save(gasto);
	}
	@Override
	public void delete(Long id) {
		gastoDado.deleteById(id);
	}
	@Override
	public Gasto findByGastoFecha(Date fecha) {
		return gastoDado.findByFecha(fecha);
	}
	@Override
	public Gasto findByGastoTitulo(String titulo) {
		return gastoDado.findByTitulo(titulo);
	}
	@Override
	public Gasto findByCliente(Cliente client) {
		return gastoDado.findByCliente(client);
	}
}
