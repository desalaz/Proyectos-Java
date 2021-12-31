package ave;
import comportamiento.Hablador;

public class Loro extends Ave implements Hablador{ //Hablador es un interface que está en el package: comportamiento
	private char region;
	private String color;
	public Loro(char s, int e, char r, String c)
	{
		super(s,e);
		region=r;
		color=c;
	}
	
	public char getRegion() {
		return region;
	}


	public void setRegion(char region) {
		this.region = region;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public void hablar(){
		System.out.println("hola soy un Loro y se hablar");
		System.out.println("mi sexo es "+getSexo());
		System.out.println("tengo "+getEdad()+" años");
		System.out.println("soy de la region "+ region+ " y mi color es "+color);
	}

}
