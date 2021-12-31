package polimorfismoFutbol;

public class Entrenador extends SeleccionFutbol {
 int idFederacion;

 Entrenador(){
	 
 }
 Entrenador(int id, String nombre, String apellido, int edad, int idFed ){
	 super(id,nombre,apellido,edad);
	 idFederacion=idFed;
 }
 
 
@Override
public void entrenamiento() {
	System.out.println("Dirige un entrenamiento "+nombre+" "+apellido+" "+edad+" con id de Federación: "+idFederacion);
}

public void planificarEntrenamiento() {
	System.out.println("Ha convocado Mañana a entrenamiento el entrenador: "+nombre+" "+apellido+" con id de Federación: "+idFederacion);
}
 public void partidoFutbol() {
	 super.partidoFutbol();
 }

	public void viajar() {
		super.viajar();
	}

	public void concentrarse() {
		super.concentrarse();
		
	}
}
