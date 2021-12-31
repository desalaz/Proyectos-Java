package persona;
import comportamiento.Hablador;
public class Bedel extends Persona implements Hablador{
	 private int turno; //sólo se puede usar en Bedel
	 private int antiguedad; //sólo se puede usar en Bedel
	public Bedel(String n, String apell, int turno, int antig)          //parámetros
	{
		super(n,apell);
		this.turno=turno;
		antiguedad=antig;
		
																			//escribe el código
	}
	

	public int getTurno() {
		return turno;
	}



	public void setTurno(int turno) {
		this.turno = turno;
	}



	public int getAntiguedad() {
		return antiguedad;
	}



	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	
	// En esta clase falta algo
	

	@Override
	public void hablar() {
		System.out.println("hola soy un Bedel y se hablar" );
		System.out.println("me llamo: "+getNombre());    
		System.out.println("mi apellido es: "+getApellido());   
		System.out.println("y estoy en el turno de: "+turno);
		System.out.println("y tengo una antiguedad de: "+antiguedad+ " años");
	}


}
