package aparato;

public class Principal {
	
	public static void main(String[] arg){//¿Hay algo mal aquí?
		Aparato objetos[]=new Aparato[4];
		objetos[0]=new Lavadora(600, 1500, 96, 105);
		objetos[1]=new Lavadora(400, 950, 100, 88);				//crea dos objetos Lavadora, 1 objeto Radio y una instancia de Tv
		objetos[2]=new Radio(120, 350, true, 220);				//comprueba que no puedes crear un objeto de Aparato
		objetos[3]=new Tv(250, 700, false, 3);
		
		for(int j=0; j<objetos.length; j++) {
			objetos[j].visualizarMarca();
			
		if(objetos[j].getClass().getName().equals("aparato.Lavadora")) {
			((Lavadora)objetos[j]).visualizarConsumo();
			}
		}
	}

}
