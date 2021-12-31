package programa;
import comportamiento.Hablador;
import persona.*;
import ave.*;


public class InterfacePrograma {
public static void main(String[] arg)
{
	Hablador lista[]=new Hablador[5];
	lista[0]=new Profesor("Pilar","Lekue","principal", "pilarlekue@ceinmark.com");
	lista[1]=new Loro('m',20,'n',"Rojo");
	lista[2]=new Alumno("Maria", "Carvajal", "DAW", 1);       //el siguiente elemento del array contiene un alumno
	lista[3]=new Bedel("Juan","Amancio", 2, 10);
	lista[4]=new Loro('h',17,'o',"Amarillo y Azul");
	for(int i=0; i<5;i++) 			//algo está mal
	{
		lista[i].hablar();
	}
	
//coloca en Persona un atributo static y un método static y utiliza dicho atributo y dicho método como quieras.	
	Persona.numeroPersonas();
	
}
}
