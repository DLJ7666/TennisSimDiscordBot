package juego;

import recursos.Country;

public class Tenista {
	
	private Long id;
	private String nombre;
	private String apellido;
	private Country nacionalidad;
	private Stats estadisticas;
	
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Country getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(Country nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Stats getEstadisticas() {
		return estadisticas;
	}
	public void setEstadisticas(Stats estadisticas) {
		this.estadisticas = estadisticas;
	}
	public Tenista(Long id, String nombre, String apellido, Country nacionalidad, Stats estadisticas) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.estadisticas = estadisticas;
	}
	
	public String toString() {
		return "Tenista [getId()=" + getId() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getNacionalidad()=" + getNacionalidad() + ", getEstadisticas()=" + getEstadisticas() + "]";
	}
}
