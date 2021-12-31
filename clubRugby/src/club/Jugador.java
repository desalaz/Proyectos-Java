package club;

public class Jugador {
	
	private long numLicencia;
	private String nombre;
	private String apellido;
	private String posicion; //medio scrum (medio mele), ala, apertura, inside centre, outside centre, hooker, pilar, wing, numero8, segunda linea, fullback
	private float estatura;
	private float peso;
	private String nacionalidad;
	public Club miclub;
	public static int contestatura, contposicion, contpeso;
	
	
	public long getNumLicencia() {
		return numLicencia;
	}

	public void setNumLicencia(long numLicencia) {
		this.numLicencia = numLicencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	
	public Jugador(){
		
		
	}
	
	public Jugador(long numLicencia, String nombre, String apellido, String nacionalidad, String posicion, float estatura, float peso, Club club){
		this.numLicencia=numLicencia;
		this.nombre=nombre;
		this.apellido=apellido;
		this.nacionalidad=nacionalidad;
		this.posicion=posicion;
		this.estatura=estatura;
		this.peso=peso;
		miclub=club;
		
		cantidadJugadores(estatura, posicion, peso);
		
	}
	
	
	public static void cantidadJugadores (float estatura, String posicion, float peso){
	
		if(estatura>=1.70f) {
			contestatura++;
			}
			
			
		if(posicion.equalsIgnoreCase("Medio mele")) {
			contposicion++;	
			}
			
			
		if(peso>=70) {
			contpeso++;
				
		}
					
	}
	
	
	void visualizar (){
		
	System.out.println(nombre + "(nombre jugador), y juega en el club: "+miclub.getNombre());	
	System.out.println();
		
	}

	
}
