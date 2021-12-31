package polimorfismoFutbol;

public abstract class SeleccionFutbol {
	int id;
	protected String nombre;
	protected String apellido;
	protected int edad;
	
	SeleccionFutbol(){		
	}
	
	SeleccionFutbol(int id, String nombre, String apellido, int edad){
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
	}
	
	public void viajar() {
		System.out.println("LLamado para viajar a: "+nombre+" "+apellido+" "+edad);
	}
	
	public void concentrarse() {
		System.out.println("Concentración con la selección para: "+nombre+" "+apellido+" "+edad);
		
	}
	public void partidoFutbol () {
		System.out.println("Asiste al partido de futbol de:"+nombre+" "+apellido+" "+edad);
	}
	
	public abstract void entrenamiento();
	
	
}
