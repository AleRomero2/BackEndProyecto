package es.fesac.proyecto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Mantenimiento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long odometro;
	private String tipo;
	private String localizacion;
	private Long precio;
	@ManyToOne
	@JoinColumn(name="VehiculoId",nullable=false)
	private Vehiculo vehiculo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOdometro() {
		return odometro;
	}
	public void setOdometro(Long odometro) {
		this.odometro = odometro;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	public Long getPrecio() {
		return precio;
	}
	public void setPrecio(Long precio) {
		this.precio = precio;
	}
}
