package club;

	public class Equipo{
 	
	private String [] equipos= new String [5];
	Club club;	
	//private String equip;
		
	public Equipo() {
		
	}
	
	public Equipo(String equip1, String equip2, String equip3, String equip4, String equip5, Club club) {
	/*	
		this.equip=equip1;
		this.equip=equip2;
		this.equip=equip3;
		this.equip=equip4;
		this.equip=equip5;
		
		for(int x=0; x<equipos.length;x++) {
			equipos[x]=(equip+(x+1));
		} */
		
		this.club=club;
		
		equipos[0]=equip1;
		equipos[1]=equip2;
		equipos[2]=equip3;
		equipos[3]=equip4;
		equipos[4]=equip5;
		
		}
		
	
	public Equipo(String [] equipos, Club club) {
		this.equipos=equipos;
		this.club=club;
		
	}
	
	public void visualizar() {
	System.out.println("El club: "+club.getNombre() +" telefono: "+ club.getTlf() + " tiene los siguientes equipos: ");	
		for(int x=0; x<equipos.length;x++) {
			if(x==0) System.out.print(equipos[x]);
			else System.out.print(", "+ equipos[x]);
		}
		
		System.out.println();
	}
	
	
	
}
