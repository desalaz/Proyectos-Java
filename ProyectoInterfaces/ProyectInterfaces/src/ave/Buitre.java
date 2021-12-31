package ave;

public class Buitre extends Ave{
private int velocidad;
private int peso;
public Buitre(char s, int e, int v, int p)  //aquí falta algo
{
	super(s,e);
	velocidad=v;
	peso=p;
}
public int getVelocidad() {
	return velocidad;
}
public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
}




}
