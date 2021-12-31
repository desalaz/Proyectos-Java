package aparato;

public class Tv extends Aparato{ //la subclase y la superclase no siguen con el convenio de escritura
private boolean texto;
private int antiguedad;
public Tv(int c, int p, boolean t, int a) //aquí hay algo mal
{
	super(c, p);
	texto=t;
	antiguedad=a;
}


public boolean isTexto() {
	return texto;
}



public void setTexto(boolean texto) {
	this.texto = texto;
}


public int getAntiguedad() {
	return antiguedad;
}


public void setAntiguedad(int antiguedad) {
	this.antiguedad = antiguedad;
}




@Override
void visualizarMarca() {
	System.out.println("La marca del Tv es: "+marca);
	
}
}
