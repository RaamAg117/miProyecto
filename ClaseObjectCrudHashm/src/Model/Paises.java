package Model;

public class Paises {
	//Atributos
	private int numPais;
	private String nombre;
	private String idiomas;
	private long poblacion;
	
	public Paises() {
	}
	public Paises(String nombre) {
		this.nombre = nombre;
	}
	
	public Paises(int numPais, String nombre, String idiomas, long poblacion) {
		this.numPais = numPais;
		this.nombre = nombre;
		this.idiomas = idiomas;
		this.poblacion = poblacion;
	}
	@Override
	public String toString() {
		return "Paises [numPais=" + numPais + ", nombre=" + nombre + ", idiomas=" + idiomas + ", poblacion=" + poblacion
				+ "]\n";
	}
	public int getNumPais() {
		return numPais;
	}
	public void setNumPais(int numPais) {
		this.numPais = numPais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	public long getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(long poblacion) {
		this.poblacion = poblacion;
	}
	
	
	
	

}
