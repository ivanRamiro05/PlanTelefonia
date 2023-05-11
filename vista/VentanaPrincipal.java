package vista;

import javax.swing.JFrame;


public class VentanaPrincipal extends JFrame {
    public PanelEntrada miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultado miPanelResultado;
    
    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    /**
     * 
     */
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntrada();
        miPanelEntradaDatos.setBounds(10,10,340,160);
        this.add(miPanelEntradaDatos);

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(350,10,340,160);
        this.add(miPanelOperaciones);

        //Creación y adición del PanelResultados
        miPanelResultado = new PanelResultado();
        miPanelResultado.setBounds(10,170,680,180);
        this.add(miPanelResultado);
         //Caracteristicas de la ventana
         this.setTitle("Plan de telefonia");
         this.setSize(710,400);
         this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setResizable(false);
         this.setVisible(true);
     }

    }

       
    

