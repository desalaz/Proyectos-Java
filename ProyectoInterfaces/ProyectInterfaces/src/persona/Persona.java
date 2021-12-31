package persona;

public abstract class Persona { //ésta clase es abstracta
	
private String nombre;
private String apellido;
static int numPer=0;
public Persona(String n, String apell)   //qué falta
{
	nombre=n;
	apellido=apell;			//falta algo
	numPer++;
}

//escribe los métodos getNombre() y getApellido() y dichos métodos lo pueden utilizar sus subclases y otras clases del package persona
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
	System.out.println("El número total de personas es: "+numPer);
}
}