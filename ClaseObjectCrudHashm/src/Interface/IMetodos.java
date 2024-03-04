package Interface;

import Model.Estados;
import Model.Paises;

//Object me permite encapsular cualquier objeto
public interface IMetodos {
	public void guardar(Object obj,String nombreObj);
	public void editar(Object obj,String nombreObj);
	public void eliminar(Object obj,String nombreObj);
	
	//Estos son metodos normales
	public Paises buscarPais(Paises p);
	
	public Estados buscarEstado(Estados e);
	
	
	public void listarPaises();
	
	public void listarEstados();
}
