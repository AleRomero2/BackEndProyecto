package es.fesac.proyecto.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String psw;
	private String email;
	@OneToMany(mappedBy="cliente",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Gasto> gastos;
	@OneToMany(mappedBy="cliente",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Trayecto> trayectos;
	@OneToMany(mappedBy="cliente",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Vehiculo> vehiculos;
	public Cliente() {
	}
	public Cliente( @NotNull String name,@NotNull  String psw, @NotNull String email) {
		this.nombre = name;
		this.psw = psw;
		this.email = email;
	}
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
