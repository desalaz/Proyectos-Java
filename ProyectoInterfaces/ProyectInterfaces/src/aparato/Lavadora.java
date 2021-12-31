package aparato;

public class Lavadora extends Aparato { //Lavadora es subclase de Aparato.Escribe bien lavadora
private int alto;
private int ancho;
public Lavadora(int c, int p, int a, int an){             //recibe los 4 parámetros
	super(c, p);											//aquí falta algo
	alto=a;
	ancho=an;
}


public int getAlto() {
	return alto;
}


public void setAlto(int alto) {
	this.alto = alto;
}


public int getAncho() {
	return ancho;
}


public void setAncho(int ancho) {
	this.ancho = ancho;
}



// escribir un método para visualizar el consumo.
void visualizarConsumo() {
	System.out.println("El consumo de la lavadora es: "+consumo);
}
//Por qué no se puede escribir un código para visualizar precio?.
//Respuesta: No se puede ya que la visibilidad del precio es solo a la clase.

//escribir el método para visualizar la marca

@Override
void visualizarMarca() {
	System.out.println("La marca de la lavadora es: "+marca);
	
}
}
