package aparato;

 abstract class Aparato { // ésta clase debe ser visible sólo en el  package aparato y no es instanciable
 protected int consumo; // se puede usar en las subclases de Aparato y en el mismo package
 private int precio; //sólo se puede usar en la clase Aparato
 public String marca="Standard";//se puede usar en cualquier clase
public Aparato(int c, int p){
	consumo=c;
	precio=p;
}



public int getPrecio() {
	return precio;
}


public void setPrecio(int precio) {
	this.precio = precio;
}


//crear un método abstracto llamado visualizarMarca()
   abstract void visualizarMarca();
}
