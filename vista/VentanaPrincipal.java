package vista;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

    //Atributos

    public PanelEntrada miEntrada;
    public PanelSalida miSalida;
    //-----------
    //constructor
    //----------
    public VentanaPrincipal(){
        
    //Creacion de mi panel entrada
    miEntrada =new PanelEntrada();
    miEntrada.setBounds(10, 10, 300, 500);
    add(miEntrada);

    //Creacion de mi panel salida
    miSalida =new PanelSalida();
    miSalida.setBounds(260, 10, 230, 500);
    add(miSalida);

    //Creacion de la ventana principal
  
     setTitle("Plan de Telefonia");
     setSize(500,500);
     setLocationRelativeTo(null);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setResizable(false);
     setVisible(true);
    }
    
}
