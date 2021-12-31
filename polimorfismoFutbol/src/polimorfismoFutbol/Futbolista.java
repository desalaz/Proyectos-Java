package polimorfismoFutbol;

public class Futbolista extends SeleccionFutbol{
	
	int dorsal;
	String demarcacion;
	Futbolista(){
		
	}
	
	Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion){
		super(id,nombre,apellido,edad);
		this.dorsal=dorsal;
		this.demarcacion=demarcacion;
	}
	
	@Override
	public void entrenamiento() {
		//super.partidoFutbol();
		System.out.println("Asiste a un entrenamiento "+nombre+" "+apellido+" "+edad+" "+"dorsal "+dorsal);
		
	}
	
	public void entrevista() {
		System.out.println("Hoy te toca una entrevista a la tv "+nombre+" "+apellido+" "+"de dorsal "+dorsal);
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
