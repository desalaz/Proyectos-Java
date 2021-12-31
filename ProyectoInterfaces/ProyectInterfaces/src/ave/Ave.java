package ave;

public class Ave {
private char sexo;
private int edad;
public Ave(char s, int e)
{
	sexo=s;
	edad=e;
}
public char getSexo()
{
	return(sexo);
}

public void setSexo(char sexo) {
	this.sexo=sexo;
}

//escribir el método getEdad()
public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad=edad;
}


}
