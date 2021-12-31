package polimorfismoFutbol;

public class MiClasePrincipal {

	public static void main(String[] args) {
		
		SeleccionFutbol [] obj1=new SeleccionFutbol[6];
		obj1[0]=new Futbolista (01,"Pedro","Gomez",33, 9,"Delantero");
		obj1[1]=new Futbolista (02,"Lionel","Messi",31, 10,"Delantero");
		obj1[2]=new Entrenador (10,"Ricardo","Pelaez",33, 05);
		obj1[3]=new Entrenador (11,"Miguel","Rodriguez",30, 118);
		obj1[4]=new Masajista (51,"Elsa","Acosta",30, "Grado en Masajes",6);
		obj1[5]=new Masajista (52,"Daniela","Suarez",30, "MBA Masajes",10);
		for(int x=0; x< obj1.length;x++) {
			obj1[x].viajar();
			obj1[x].concentrarse();
			obj1[x].entrenamiento();
			obj1[x].partidoFutbol();
			
			if(obj1[x].getClass().getName().equals("polimorfismoFutbol.Futbolista")) {
				((Futbolista)obj1[x]).entrevista();
				
			}else if(obj1[x].getClass().getName().equals("polimorfismoFutbol.Entrenador")) {
				((Entrenador)obj1[x]).planificarEntrenamiento();
			}else {
				((Masajista)obj1[x]).darMasaje();
			}
		}
		
	}


}
