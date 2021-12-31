package club;

	public class Club {
		
	private	String codigo;
	private	String nombre;
	private	String sedeSocial; 
	private	String mail; 
	private	int tlf; 
	private	short anyo;
	
	
	public Club() {
		
	}
	
	public Club(String nombre, short anyo) {
		this.nombre=nombre;
		this.anyo=anyo;
	}
	
	public Club(String nombre, int tlf, short anyo) {
		this.nombre=nombre;
		this.tlf=tlf;
		this.anyo=anyo;
	}
	
	
	public Club(String codigo, String nombre, String sedeSocial, String mail, int tlf, short anyo) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.sedeSocial=sedeSocial;
		this.mail=mail;
		this.tlf=tlf;
		this.anyo=anyo;
	}
	
	
	public String getCodigo() {
	return codigo;
}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getSedeSocial() {
		return sedeSocial;
	}
	
	public void setSedeSocial(String sedeSocial) {
		this.sedeSocial = sedeSocial;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public int getTlf() {
		return tlf;
	}
	
	public void setTlf(int tlf) {
		this.tlf = tlf;
	}
	
	public short getAnyo() {
		return anyo;
	}
	
	public void setAnyo(short anyo) {
		this.anyo = anyo;
	}

	
	
	public void visualizar() {
		
	System.out.println("El club de rugby llamado: "+ nombre+ " se fundó en el año: "+ anyo);
	System.out.println();
		
	}



}
