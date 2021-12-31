package packMain;
import java.util.*;
import club.*;
import club.arraylist.*;
public class Principal {

	public static void main(String[] args) {
		
		String [] esport= {"Senior Femenino", "Senior Masculino", "Senior B", "Sub18", "Sub16"};
		
		Club clb=new Club ("ABC194","SkyFalls", "Almeria", "email@email.com",65431158,(short) 2016);
		//clb.visualizar();
		
		Club clb2=new Club ("CRAT",944598760, (short)1934);
		//clb2.visualizar();
		
		Club clb3=new Club ("TJM466","Bufalos", "Madrid", "bufalos@email.com",684329553,(short) 1932);
		Club clb4=new Club ("JLP279","Cañeros", "Portugal", "cañeros@email.com",432955361,(short) 1945);
		
		Equipo miequipo=new Equipo ("Senior Femenino", "Senior Masculino", "Senior B", "Sub18", "Sub16", clb);
		//miequipo.visualizar();
	
		Equipo miequipo2=new Equipo (esport, clb2);
		//miequipo2.visualizar();
		
		Jugador player1= new Jugador(123456, "Jordi", "Jorba", "EEUU", "Medio mele", 1.99f, 90.5f, clb);
		Jugador player2= new Jugador(245691, "Asier", "Usarrga", "España", "Ala", 1.59f, 60.3f, clb2);
		Jugador player3= new Jugador(985623, "Aroa", "Gonzalez", "España", "Hooker", 1.86f, 77.5f, clb);
		Jugador player4= new Jugador(135698, "Pilar", "Lopez", "Nueva Zelanda", "inside centre", 1.70f, 70.5f, clb2);
		Jugador player5= new Jugador(884317, "Rocio", "Garcia", "Francia", "Medio mele", 1.91f, 88.5f, clb);
		
	//	System.out.println("Jugadores con altura mayor a 1,70cm hay: "+ Jugador.contestatura);
		
	//	System.out.println("Medio mele, en esta posición hay: "+Jugador.contposicion);
		
	//	System.out.println("Jugadores con peso mayor de 70k hay: "+ Jugador.contpeso);
		
		
		Resultados result=new Resultados ((byte)55, player3, "seis - cero", "doce - cuatro", "drop", (byte) 16);
		//result.visualizar();
		
		ClubArrayList.agregar(clb);
		ClubArrayList.agregar(clb2);
		ClubArrayList.agregar(clb3);
		ClubArrayList.agregar(clb4);
	
		ClubArrayList.visualizar();
		/*
		ClubArrayList.borrar();
		ClubArrayList.visualizar();
		*/

		JugadorArrayList.agregar();
		JugadorArrayList.visu();
		
	}

}
