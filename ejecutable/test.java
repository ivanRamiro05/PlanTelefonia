package ejecutable;

import controlador.controlador;
import modelo.PlanTelefonia;
import vista.VentanaPrincipal;

public class test{
    public static void main(String[] args) {
        VentanaPrincipal miventana =new VentanaPrincipal();
        PlanTelefonia miPlan = new PlanTelefonia();
        controlador miControlador = new controlador(miventana, miPlan);
        
    }
}