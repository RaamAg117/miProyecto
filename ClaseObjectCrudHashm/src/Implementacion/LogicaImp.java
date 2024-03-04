package Implementacion;

import java.util.HashMap;

import Interface.IMetodos;
import Model.Estados;
import Model.Paises;

public class LogicaImp implements IMetodos{
///Aqui va la logica 
	
	HashMap<String,Paises> hasPaises = new HashMap<String,Paises>();
	Paises pais;
	
	HashMap<Integer,Estados> hasEstados = new HashMap<Integer,Estados>();
	Estados estado;
	
	@Override
	public void guardar(Object obj, String nombreObj) {
		// TODO Auto-generated method stub
		//Realizamos el casteo
		if (nombreObj.equals("p")) {
			pais = (Paises) obj;
			hasPaises.put(pais.getNombre(), pais);
		}else
			if(nombreObj.equals("e"))
		{
				estado= (Estados) obj;
				hasEstados.put(estado.getNumEstado(), estado);
		}
	}

	@Override
	public void editar(Object obj, String nombreObj) {
		// TODO Auto-generated method stub
		if (nombreObj.equals("p")) {
			pais = (Paises) obj;
			hasPaises.put(pais.getNombre(), pais);
		}else
			if(nombreObj.equals("e"))
		{
				estado= (Estados) obj;
				hasEstados.put(estado.getNumEstado(), estado);
		}
	}

	@Override
	public void eliminar(Object obj, String nombreObj) {
		// TODO Auto-generated method stub
		if (nombreObj.equals("p")) {
			pais = (Paises) obj;
			hasPaises.remove(pais.getNombre());
		}else
			if(nombreObj.equals("e"))
		{
				estado= (Estados) obj;
				hasEstados.remove(estado.getNumEstado());
				//hasEstados.put(estado.getNumEstado(), estado)
		}
	}

	@Override
	public Paises buscarPais(Paises p) {
		// TODO Auto-generated method stub
		return hasPaises.get(p.getNombre());
	}

	@Override
	public Estados buscarEstado(Estados e) {
		// TODO Auto-generated method stub
		return hasEstados.get(e.getNumEstado());
	}

	@Override
	public void listarPaises() {
		// TODO Auto-generated method stub
		System.out.println(hasPaises);
	}

	@Override
	public void listarEstados() {
		// TODO Auto-generated method stub
		System.out.println(hasEstados);
	}

}
