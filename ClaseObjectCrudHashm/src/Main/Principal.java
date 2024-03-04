package Main;

import Model.Estados;
import Model.Paises;
import java.util.Scanner;

import Implementacion.LogicaImp;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declarar variables
		
		 int numPais;
		 String nombreP;
		 String idiomasP;
		 long poblacionP;
		 Paises p;
		 
		 int numEstado;//Esta es la llave
		 String nombreE;
		 String terri;
		 int numMunicipiosE;
		 Estados e;
		 
		 Scanner s = null;// new Scanner(System.in);
		 
		 int principal,menuP, menuE,subP,subE;
		 
		 //Instanica de la clase 
		 LogicaImp logica = new LogicaImp();
		 
		 do {
			 System.out.println("----------Menu Principal-----------");
			 System.out.println("1---------Crud Paises");
			 System.out.println("2---------Crud Estados");
			 System.out.println("3---------Salir");
			 s = new Scanner(System.in);
			 principal = s.nextInt();
			 
			 switch(principal) {
			 case 1://Crud paises
				 do {
					 System.out.println("---------Menu Paises--------");
					 System.out.println("1--------Guardar");
					 System.out.println("2--------Listar");
					 System.out.println("3--------Buscar");
					 System.out.println("4--------Editar");
					 System.out.println("5--------Eliminar");
					 System.out.println("6--------Regresar al menu principal");
					 s = new Scanner(System.in);
					 menuP = s.nextInt();
					 
					 switch(menuP) {
					 case 1://guardar
						 System.out.println("Ingresa el numero de Pais: ");
						 s = new Scanner(System.in);
						 numPais = s.nextInt();
						 System.out.println("Ingresa el nombre del pais: ");
						 s = new Scanner(System.in);
						 nombreP = s.nextLine();
						 System.out.println("Ingresa el idiomas del pais: ");
						 s = new Scanner(System.in);
						 idiomasP = s.nextLine();
						 System.out.println("Ingresa la poblacion del pais: ");
						 s = new Scanner(System.in);
						 poblacionP = s.nextLong();
						 
						 //Guardar 
						 p = new Paises(numPais,nombreP,idiomasP,poblacionP);
						 logica.guardar(p,"p");
						 
						 break;
					 case 2://mostrar paises
						 logica.listarPaises();
						 break;
					 case 3:///Buscar
						 System.out.println("Ingresa nombre del Pais a buscar: ");
						 nombreP = s.next();
						 
						 p = new Paises(nombreP);
						 p = logica.buscarPais(p);
						 
						 System.out.println("Pais: "+p);
						 
						 break;
					 case 4:///Editar
						 System.out.println("Ingresa nombre del Pais a editar: ");
						 nombreP = s.next();
						 
						 p = new Paises(nombreP);
						 p = logica.buscarPais(p);
						 
						 System.out.println("Se encontro: "+p);
						 do {
							 System.out.println("---------Modificar--------");
							 System.out.println("1--------Idiomas");
							 System.out.println("2--------Poblacion");
							 System.out.println("3--------Salir");
							 subP = s.nextInt();
							 
							 switch(subP) {
							 case 1:
								 System.out.println("Ingresa el nuevo idioma: ");
								 idiomasP = s.next();
								 
								 p.setIdiomas(idiomasP);
								 
								 logica.editar(p, "p");
								 
								 break;
							 case 2:
								 System.out.println("Ingresa nueva poblacion: ");
								 poblacionP = s.nextLong();
								 
								 p.setPoblacion(poblacionP);
								 
								 logica.editar(p, "p");
								 break;
							 case 3:
								 break;
							 }
						 }while(subP<3);
						 break;
					 case 5://///ELIMINAR
						 System.out.println("Ingresa nombre del pais a eliminar: ");
						 nombreP = s.next();
						 p = new Paises(nombreP);
						 logica.eliminar(p, "p");
						 
						 break;
					 case 6: 
						 break;
					 }
				 }while(menuP<6);
				 break;
			 case 2://Crud Estados
				 do {
					 System.out.println("----------Menus Estados---------");
					 System.out.println("1---------Guardar");
					 System.out.println("2---------Listar");
					 System.out.println("3---------Buscar");
					 System.out.println("4---------Editar");
					 System.out.println("5---------Eliminar");
					 System.out.println("6---------Regresar al menu principal");
					 menuE = s.nextInt();
					 
					 switch(menuE) {
					 case 1:
						 break;
					 case 2:
						 break;
					 case 3:
						 break;
					 case 4:
						 break;
					 case 5:
						 break;
					 case 6:
						 break;
					 }
				 }while(menuE<6);
				 
				 
				 break;
			 case 3:///salir
				 break;
			 }
			 
		 }while(principal<3);
		 
		 
	}

}
