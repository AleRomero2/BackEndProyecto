package es.fesac.proyecto.model;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	private String name;
	private String model;
	private int anio;
	private String consumo;
	//private List<Vehiculo> vehiculoList;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getConsumo() {
		return consumo;
	}
	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}
	/*public List<Vehiculo> getVehiculoList() {
		return vehiculoList;
	}
	public void setVehiculoList(List<Vehiculo> vehiculoList) {
		this.vehiculoList = vehiculoList;
	}*/
	
}
