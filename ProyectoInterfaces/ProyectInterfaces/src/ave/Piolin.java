package ave;

public class Piolin extends Canario{
	private int peli;
	public Piolin(char s, int e, String c, int peli)
	{
		super(s, e, c);
		this.peli=peli; 			//corregir
	}
	public int getPeli() {
		return peli;
	}
	public void setPeli(int peli) {
		this.peli = peli;
	}

	
}
