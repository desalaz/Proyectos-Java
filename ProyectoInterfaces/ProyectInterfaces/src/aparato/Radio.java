package aparato;

public class Radio extends Aparato{ //Escribe bien
private boolean casete;
private int potencia;
public Radio(int c, int p, boolean ca, int po)
{
	super(c,p);
	casete=ca;
	potencia=po;
}



public boolean isCasete() {
	return casete;
}



public void setCasete(boolean casete) {
	this.casete = casete;
}



public int getPotencia() {
	return potencia;
}



public void setPotencia(int potencia) {
	this.potencia = potencia;
}



@Override
void visualizarMarca() {
	System.out.println("La marca del Radio es: "+marca);
	
}
}
