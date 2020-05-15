package es.fesac.proyecto.implement;

import java.util.List;

import es.fesac.proyecto.service.IVehiculoService;
import es.fesac.proyecto.model.Vehiculo;
import es.fesac.proyecto.repository.IVehiculoRepository;



public class VehiculoServiceImpl implements IVehiculoService{
	
	private IVehiculoRepository vehiculoDado;
	@Override
	public List<Vehiculo> findAll(){
		return (List<Vehiculo>) vehiculoDado.findAll();
	}
	@Override
	public Vehiculo findById(Long id) {
		return vehiculoDado.findById(id).get();
	}
	@Override
	public Vehiculo save(Vehiculo vehi){
		return vehiculoDado.save(vehi);
	}
	@Override
	public void delete(Long id){
		vehiculoDado.deleteById(id);
	}
	@Override
	public Vehiculo findByConsumo(String carName){
		return vehiculoDado.findByConsumo(carName);	
	}
	@Override
	public Vehiculo findByCarburante(String carModel){
		return vehiculoDado.findByCarburante(carModel);
	}
}
