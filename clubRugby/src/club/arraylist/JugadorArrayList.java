package club.arraylist;
import java.util.*;
import club.Club;
import club.Jugador;

public class JugadorArrayList {
	public static Scanner teclado=new Scanner(System.in);
	static ArrayList <Jugador> jugadores= new ArrayList <Jugador>();
	
 public	static Club miclub =new Club("Dragones", 5652352, (short)1999);

 public static Club ob=null;

 
 
	JugadorArrayList(){
		
	}
	
	public static void agregar() {
		
		 ClubArrayList.clubList.add(miclub);
		
		Jugador jug1=new Jugador(56974 , "Pedro", " Garcia", "Venezolano", "Medio mele", 1.75f, 88, miclub);
		jugadores.add(jug1);
		Jugador jug2=new Jugador(56974 , "Juan", " Herera", "Venezolano", "Medio mele", 1.96f, 108, miclub);
		jugadores.add(jug2);
		char opc= 'n';
		
		do {
		
		boolean localizado=false;
		
		
		do{
	
		System.out.println("Alta a un/a jugador/a. Teclea en qué club jugará:");
		
		ClubArrayList.visualizar1();
		System.out.println("Teclea el nombre del club que deseas:");
		String nombtecleado=teclado.nextLine();
		
		Iterator <Club> it1= ClubArrayList.clubList.iterator();
		while (it1.hasNext() && !localizado) {
			ob=it1.next();
		if(ob.getNombre().equals(nombtecleado)) localizado=true;
			
		}
			if(!localizado) {
				System.out.println("No existe este club, vuelve a teclear");
			}
	
		}while(!localizado);
		

		long numLic = 0;
		String nom="";
		String apell="";
		String nacio="";
		String posi="";
		float estat=0;
		float peso=0;
		
	Jugador jugx=new Jugador(numLic, nom, apell, nacio, posi, estat, peso, ob);
	
	System.out.println("tecla los datos del jugador: NumeroLicencia");
	 numLic=teclado.nextLong();
	 jugx.setNumLicencia(numLic);
	   teclado.nextLine();
	System.out.println("tecla los datos del jugador: Nombre");
	nom=teclado.nextLine();
	 jugx.setNombre(nom);
	System.out.println("tecla los datos del jugador: Apellido");
	 apell=teclado.nextLine();
	jugx.setApellido(apell);		  
	System.out.println("tecla los datos del jugador: Nacionalidad");
	 nacio=teclado.nextLine();
	  jugx.setNacionalidad(nacio);
	System.out.println("tecla los datos del jugador: Posicion");
	posi=teclado.nextLine();
     jugx.setPosicion(posi);

    System.out.println("tecla los datos del jugador: Estatura");
    estat=teclado.nextFloat();
     jugx.setEstatura(estat);
    
    System.out.println("tecla los datos del jugador: Peso");
    peso=teclado.nextFloat();
     jugx.setPeso(peso);  
   
       jugadores.add(jugx);
          
    System.out.println("Teclear más jugadores s/n??");
	opc=teclado.next().charAt(0);
		
		}while(opc =='s');
		
	}
	
	public static void visu(){
	Iterator <Jugador> it = jugadores.iterator(); 	
	    while(it.hasNext()) {
	    Jugador jugador=it.next();	      
	  System.out.println(jugador.getNombre()+", "+ jugador.getApellido()+", "+jugador.getPosicion()+", "+jugador.miclub.getNombre()); 
	    	
	   }  
	} 
}
	

