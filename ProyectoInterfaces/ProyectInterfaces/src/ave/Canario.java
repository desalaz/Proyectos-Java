package ave;

public class Canario extends Ave{
private String canta;
public Canario(char s, int e, String c)
{
	super(s, e);
	canta=c;					//escribir el código correspondiente
}
public String getCanta() {
	return canta;
}
public void setCanta(String canta) {
	this.canta = canta;
}


}
