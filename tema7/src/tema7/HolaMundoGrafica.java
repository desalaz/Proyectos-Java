package tema7;
import javax.swing.JFrame; //La clase JFrame encapsula el concepto de una ventana
import javax.swing.JLabel; //La clase JLabel  tiene por objetivo mostrar un texto dentro de un JFrame.

public class HolaMundoGrafica extends JFrame{ /*Para que la clase muestre  una ventana debe
                                                heredar de la clase JFrame:*/	
    private JLabel label1;  //Definimos  un objeto de la clase JLabel:
    public HolaMundoGrafica() {
        setLayout(null); /*método heredado de la clase JFrame con el parámetro null,
                           significa que utilizaremos posicionamiento absoluto    
                           para los controles visuales dentros del JFrame.*/
        label1=new JLabel("Hola Mundo."); //crear el objeto de la clase JLabel con el texto a mostrar                                          
        label1.setBounds(10,20,100,40); //Ubicamos y damos tamaño(píxeles) al texto: columna, fila, ancho, alto
        add(label1); //metodo heredado de  JFrame que  añade el control JLabel al control JFrame.
//JFrame contiene una barra de menu y un Content Pane (panel) accesible a través del método getContentPane()
//Para añadir nuestra etiqueta a JFrame habría que escribir: getContentPane().add(label1), es suficiente con //add(label1)
//getContentPane().setBackground(Color.blue);
    }    
    public static void main(String[] ar) {
        HolaMundoGrafica grafica1=new HolaMundoGrafica();
        grafica1.setBounds(10,10,400,300); //Ubicamos y damos tamaño a la ventana: columna, fila, ancho, alto
        grafica1.setVisible(true); // Se hace visible el Jframe
        grafica1.setResizable(false);/* el operador no puede modificar el tamaño de la ventana*/

        grafica1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //para que cuando cerremos la ventana no siga ejecutandose el          
                                                                    //programa    
    }

}
