package polimorfismoFutbol;

public class Masajista extends SeleccionFutbol {
	String titulacion;
	int aniosExperiencia; 
	
	
	Masajista(){
		
	}
	Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExp){
		super(id, nombre, apellido, edad);
		this.titulacion=titulacion;
		aniosExperiencia=aniosExp;
	}
	
	public void darMasaje() {
		System.out.println("Hoy dara un masaje: "+nombre+" "+apellido+" "+titulacion);
	}
	
	public void partidoFutbol() {
		super.partidoFutbol();
	}
	
	
	@Override
	public void entrenamiento() {
		System.out.println("El masajista del entrenamiento es: "+nombre+" "+apellido+" "+titulacion);
		
	}
	
	public void viajar() {
		super.viajar();
	}
	
	public void concentrarse() {
		super.concentrarse();
		
	}

}
