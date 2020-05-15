package es.fesac.proyecto.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity

public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String consumo;
	private String carburante;
	@ManyToOne
	@JoinColumn(name="cliente_id")//deberia no ser nullable
	private Cliente cliente_id;
	public Cliente getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(Cliente cliente_id) {
		this.cliente_id = cliente_id;
	}
	public List<Mantenimiento> getMantenimientos() {
		return mantenimientos;
	}
	public void setMantenimientos(List<Mantenimiento> mantenimientos) {
		this.mantenimientos = mantenimientos;
	}

	@OneToMany(mappedBy="vehiculo",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Mantenimiento> mantenimientos;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConsumo() {
		return consumo;
	}
	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public String getCarburante() {
		return carburante;
	}
	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
	
}
