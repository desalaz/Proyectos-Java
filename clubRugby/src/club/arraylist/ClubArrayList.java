package club.arraylist;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import club.Club;


public class ClubArrayList {

		
	static ArrayList <Club> clubList= new ArrayList <Club>();
	static int contfund=0;	
	
	
	
	public ClubArrayList(){
		
	}
	
	public static void agregar(Club a) {
	
	clubList.add(a);
	System.out.println(a.getNombre()+", tlf: "+ a.getTlf()+", año de fundado: " +a.getAnyo());
		
		if (a.getAnyo() > 2000) {
			contfund++;
		}
		
	
	}
	
	public static void borrar() throws ConcurrentModificationException {
	
		try {
		Iterator <Club> it = clubList.iterator(); 	
			
	    while(it.hasNext()) {
	    	//Club o= it.next();       Lo debo colocar asi en caso de necesitar hacer dos preguntas.
	    if(it.next().getAnyo()<1950) {
	    	it.remove();
	    }
	    
	   } 
	    
	    
		}catch(Exception problem) {
			//System.out.println(problem);
		}
		
	
	
	/*	
		//BUCLE FOR EACH
		try {
		
	         for (Club x: clubList){
	        	 
	        	 System.out.println(x.getNombre());
	        	 if(x.getAnyo() < 1950) 
	        	  clubList.remove(x);
	        	}   
	         
		}catch(Exception problem) {
			//System.out.println(problem);
		}
	*/
	
	
/*
	// BUCLE FOR NORMAL
	
	for(int i=0;i<clubList.size();i++) {
		
//	Club e=clubList.get(i);	
	System.out.println(clubList.get(i).getNombre());	

//	System.out.println(e.getNombre());	
		if (clubList.get(i).getAnyo()<1950) {
			clubList.remove(i);
		}
		
	}
		*/
	}	
	
	
	
	public static void visualizar() {
		
		System.out.println("La cantidad de clubes que hay es: "+ clubList.size());
		System.out.println("La cantidad de clubes fundados despues de 2000 es: "+ contfund);
			
		for	(Club ml: clubList) {
			Club x=ml;
			System.out.println(x.getNombre());
		}
		
		
		}
	
	public static void visualizar1() {
		
		for	(Club ml1: clubList) {
			Club x1=ml1;
			System.out.println(x1.getNombre());
		}
		
		
		}
	
	
	
}	
	
		
		

		
		
			
		
		
	
	
	
	

