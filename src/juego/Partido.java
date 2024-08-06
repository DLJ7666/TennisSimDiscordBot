package juego;

public class Partido {
	
	private Long id;
	private Tenista tenista1;
	private Tenista tenista2;
	private Integer setsTenista1;
	private Integer setsTenista2;
	private Integer juegosTenista1;
	private Integer juegosTenista2;
	private Marcador puntosTenista1;
	private Marcador puntosTenista2;
	
	public Long getId() {
		return id;
	}
	public Tenista getTenista1() {
		return tenista1;
	}
	public Tenista getTenista2() {
		return tenista2;
	}
	public Integer getSetsTenista1() {
		return setsTenista1;
	}
	public Integer getSetsTenista2() {
		return setsTenista2;
	}
	public Integer getJuegosTenista1() {
		return juegosTenista1;
	}
	public Integer getJuegosTenista2() {
		return juegosTenista2;
	}
	public Marcador getPuntosTenista1() {
		return puntosTenista1;
	}
	public Marcador getPuntosTenista2() {
		return puntosTenista2;
	}
	public void setSetsTenista1(Integer setsTenista1) {
		this.setsTenista1 = setsTenista1;
	}
	public void setSetsTenista2(Integer setsTenista2) {
		this.setsTenista2 = setsTenista2;
	}
	public void setJuegosTenista1(Integer juegosTenista1) {
		this.juegosTenista1 = juegosTenista1;
	}
	public void setJuegosTenista2(Integer juegosTenista2) {
		this.juegosTenista2 = juegosTenista2;
	}
	public void setPuntosTenista1(Marcador puntosTenista1) {
		this.puntosTenista1 = puntosTenista1;
	}
	public void setPuntosTenista2(Marcador puntosTenista2) {
		this.puntosTenista2 = puntosTenista2;
	}
	public Partido(Long id, Tenista tenista1, Tenista tenista2, Integer setsTenista1, Integer setsTenista2,
			Integer juegosTenista1, Integer juegosTenista2, Marcador puntosTenista1, Marcador puntosTenista2) {
		this.id=id;
		this.tenista1 = tenista1;
		this.tenista2 = tenista2;
		this.setsTenista1 = setsTenista1;
		this.setsTenista2 = setsTenista2;
		this.juegosTenista1 = juegosTenista1;
		this.juegosTenista2 = juegosTenista2;
		this.puntosTenista1 = puntosTenista1;
		this.puntosTenista2 = puntosTenista2;
	}
	
	public String toString() {
		return "Partido " + getId() + ":\n"
				+ getTenista1().getNombre() + " " + getTenista1().getApellido() + " vs "
				+ getTenista2().getNombre() + " " + getTenista2().getApellido() + "\n"
				+ "Sets: " + getSetsTenista1() + "-" + getSetsTenista2() + "\n"
				+ "Juegos: " + getJuegosTenista1() + "-" + getJuegosTenista2() + "\n"
				+ "Puntos: " + getPuntosTenista1() + "-" + getPuntosTenista2();
	}
	
	
	

}
