package Model;

public class Estados {
	//Atributos
	private int numEstado;//Esta es la llave
	private String nombre;
	private String terri;
	private int numMunicipios;
	private Paises pais;//se le dira a que paias pertenece
	
	public Estados() {
	}

	public Estados(int numEstado) {
		this.numEstado = numEstado;
	}

	public Estados(int numEstado, String nombre, String terri, int numMunicipios, Paises pais) {
		this.numEstado = numEstado;
		this.nombre = nombre;
		this.terri = terri;
		this.numMunicipios = numMunicipios;
		this.pais = pais;
	}

	public int getNumEstado() {
		return numEstado;
	}

	public void setNumEstado(int numEstado) {
		this.numEstado = numEstado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTerri() {
		return terri;
	}

	public void setTerri(String terri) {
		this.terri = terri;
	}

	public int getNumMunicipios() {
		return numMunicipios;
	}

	public void setNumMunicipios(int numMunicipios) {
		this.numMunicipios = numMunicipios;
	}

	public Paises getPais() {
		return pais;
	}

	public void setPais(Paises pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Estados [numEstado=" + numEstado + ", nombre=" + nombre + ", terri=" + terri + ", numMunicipios="
				+ numMunicipios + ", pais=" + pais + "]\n";
	}

	//La variable de tipo objeto "pais" va a partir de aqui a abajo
	
	
	
	
	
}
