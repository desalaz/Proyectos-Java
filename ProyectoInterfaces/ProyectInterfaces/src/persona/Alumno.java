package persona;
import comportamiento.Hablador;

public class Alumno extends Persona implements Hablador { //alumno es subclase de Persona e implementa la interface Hablador
	private String ciclo;
	private int curso;
	public Alumno(String n, String apell, String c, int cu)					//aquí está algo mal
	{
		super(n,apell);
		ciclo=c;
		curso=cu;					//escribe el código correspondiente
	}
	
	
	public void hablar()
	{
		System.out.println("hola soy un Alumno y se hablar" );
		System.out.println("me llamo: "+getNombre());    //se debe visualizar el nombre del alumno
		System.out.println("mi apellido es: "+getApellido());    //se debe visualizar el apellido  del alumno
		System.out.println("y estoy en el ciclo: "+ciclo+ " cursando el " +curso+ " año");
	}

}
