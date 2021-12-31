package tema7;

import javax.swing.*; //se encuentran las tres clases JMenuBar, JMenu y JMenuItem        
import java.awt.*; //se encuentra la clase Color:
import java.awt.event.*;
public class Menus extends JFrame implements ActionListener{
private JMenuBar mb; //se necesitará un solo objeto de esta clase
private JMenu menu1; //esta clase tiene por objeto desplegar un conjunto de objetos de tipo JMenuItem u otros objetos de tipo JMenu:
private JMenuItem mi1,mi2,mi3;
private JTextField texto1; //Definimos tres objetos de la clase JMenuItem (estos son los que disparan eventos cuando el operador los selecciona

public Menus() {
setLayout(null);
mb=new JMenuBar();
mb.setBounds(0,0,300,20);
add(mb);
menu1=new JMenu("VISUALIZAR");
mb.add(menu1);
mi1=new JMenuItem("ALUMNOS DE WEB");
mi1.addActionListener(this);
menu1.add(mi1);
mi2=new JMenuItem("ALUMNOS DE TURISMO");
mi2.addActionListener(this);
menu1.add(mi2);
mi3=new JMenuItem("ALUMNOS DE ENFERMERIA");
mi3.addActionListener(this);
menu1.add(mi3);
texto1=new JTextField();
texto1.setBounds(10,20,100,20);


}

public void actionPerformed(ActionEvent e) {


if (e.getSource()==mi1) {

texto1.setText(" web");
add(texto1);
}
else if (e.getSource()==mi2) {

texto1.setText(" turismo");
add(texto1);

}
else if (e.getSource()==mi3) {

texto1.setText(" Enfermería");
add(texto1);

}

}
public static void main(String[] ar) {
Menus ventana=new Menus();
ventana.setBounds(10,20,300,200);
ventana.setVisible(true);
ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}    
}
