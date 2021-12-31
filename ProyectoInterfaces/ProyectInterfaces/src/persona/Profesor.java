package persona;
import comportamiento.Hablador;

public class Profesor extends Persona implements Hablador{
private String despacho;
private String email;
public Profesor(String n, String apell, String d,String em)// falta algo
{
	super(n,apell);
	despacho=d;
	email=em;
}
public void hablar()
{
	System.out.println("hola soy un Profesor y se hablar" );
	System.out.println("me llamo "+getNombre());
	System.out.println("mi apellido es "+getApellido()); // apellido
	System.out.println("y estoy en el despacho "+despacho+" y mi email es: "+ email);
}
}
