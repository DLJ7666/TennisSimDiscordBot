package juego;

public class Stats {
	
	private Integer derecha;
	private Integer experiencia;
	private Integer reves;
	private Integer saque;
	private Integer dejada;
	private Integer fisico;
	private Integer resistencia;
	
	public Integer getDerecha() {
		return derecha;
	}
	public void setDerecha(Integer derecha) {
		this.derecha = derecha;
	}
	public Integer getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}
	public Integer getReves() {
		return reves;
	}
	public void setReves(Integer reves) {
		this.reves = reves;
	}
	public Integer getSaque() {
		return saque;
	}
	public void setSaque(Integer saque) {
		this.saque = saque;
	}
	public Integer getDejada() {
		return dejada;
	}
	public void setDejada(Integer dejada) {
		this.dejada = dejada;
	}
	public Integer getFisico() {
		return fisico;
	}
	public void setFisico(Integer fisico) {
		this.fisico = fisico;
	}
	public Integer getResistencia() {
		return resistencia;
	}
	public void setResistencia(Integer resistencia) {
		this.resistencia = resistencia;
	}
	
	public Stats(Integer derecha, Integer experiencia, Integer reves, Integer saque, Integer dejada, Integer fisico,
			Integer resistencia) {
		this.derecha = derecha;
		this.experiencia = experiencia;
		this.reves = reves;
		this.saque = saque;
		this.dejada = dejada;
		this.fisico = fisico;
		this.resistencia = resistencia;
	}
	
}
