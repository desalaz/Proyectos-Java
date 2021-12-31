package paqtema10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.jdom2.*; 
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class GeneradorXML {
   public static void main(String[] args) throws IOException {

	Element raiz = new Element("DATOS");
	Document doc=new Document(raiz);
		
	Element estudiante1=new Element("ESTUDIANTE");
	estudiante1.addContent(new Element("NOMBRE").addContent("Maria"));
	estudiante1.addContent(new Element("APELLIDOS").addContent("Martin"));
	estudiante1.addContent(new Element("CARNET").addContent("15876445"));
		
	raiz.addContent(estudiante1);
		
	XMLOutputter salida=new XMLOutputter();
	FileWriter fw=new FileWriter(new File("alumnos.xml"));
	salida.output(doc, fw);
	}
}
