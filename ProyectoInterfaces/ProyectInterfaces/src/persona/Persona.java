package persona;

public abstract class Persona { //�sta clase es abstracta
	
private String nombre;
private String apellido;
static int numPer=0;
public Persona(String n, String apell)   //qu� falta
{
	nombre=n;
	apellido=apell;			//falta algo
	numPer++;
}

//escribe los m�todos getNombre() y getApellido() y dichos m�todos lo pueden utilizar sus subclases y otras clases del package persona
protected String getNombre() {
	return nombre;
}

protected void setNombre(String nombre) {
	this.nombre = nombre;
}

protected String getApellido() {
	return apellido;
}

protected void setApellido(String apellido) {
	this.apellido = apellido;
}


public static void numeroPersonas() {
	System.out.println("El n�mero total de personas es: "+numPer);
}
}