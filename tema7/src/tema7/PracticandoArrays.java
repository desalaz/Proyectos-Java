package tema7;

public class PracticandoArrays {

	 String [] usuarios= {"Juan", "Desi", "Carmen","Olga"};
	 String [] claves= {"abc1", "1234","9876","xxzz"};
	
	
	 PracticandoArrays(){
		 
	 }
	 
	 void obtener() {
	boolean match1=false;
	boolean match2=false;	 
	int pos=0;
		 
	 for (int f=0; f<usuarios.length;f++) {
		 pos=f;
	System.out.println("El usuario "+usuarios[pos]+ " tiene esta clave: "+ claves[pos]);
	
		 }
	
	
	 }
	
	
	public static void main(String[] args) {
		PracticandoArrays obj= new PracticandoArrays();
			obj.obtener();

	}

}
