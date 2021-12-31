package club;

public class Resultados {
	private byte codPartido;
	Jugador jugador;
	private String primerTiempo;
	private String segundoTiempo;
	private String puntuacion;
	private byte minuto;
	
	public byte getCodPartido() {
		return codPartido;
	}

	public void setCodPartido(byte codPartido) {
		this.codPartido = codPartido;
	}


	public String getPrimerTiempo() {
		return primerTiempo;
	}

	public void setPrimerTiempo(String primerTiempo) {
		this.primerTiempo = primerTiempo;
	}

	public String getSegundoTiempo() {
		return segundoTiempo;
	}

	public void setSegundoTiempo(String segundoTiempo) {
		this.segundoTiempo = segundoTiempo;
	}

	public String getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}

	public byte getMinuto() {
		return minuto;
	}

	public void setMinuto(byte minuto) {
		this.minuto = minuto;
	}
	

	public Resultados (){
		
	}

	public Resultados (byte codPartido, Jugador jugador, String primerTiempo, String segundoTiempo, String puntuacion, byte minuto){
		this.codPartido=codPartido;
		this.jugador=jugador;
		this.primerTiempo=primerTiempo;
		this.segundoTiempo=segundoTiempo;
		this.puntuacion=puntuacion;
		this.minuto=minuto;
	}
	
	
	public void visualizar (){
		System.out.println("Jugador/a: "+jugador.getNombre()+" ,nacionalidad: "+ jugador.getNacionalidad()+" , del club: "
		+jugador.miclub.getNombre()+" ha jugado el partido cod: "+getCodPartido());
		
		System.out.println();
	}

	
}
