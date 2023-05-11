package modelo;

import javax.swing.JLabel;
import javax.swing.JTextField;



public class PlanTelefonia {
      //Atributos
      private  int numeroCelular;
      private  String Operador;
      private  int CantidadMinutos;
      private  int Valorminuto = 150;
      private  int CostoPlan;
  
      
  
      public PlanTelefonia(){
          
      }



    public int getNumeroCelular() {
        return numeroCelular;
    }



    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }



    public String getOperador() {
        return Operador;
    }



    public void setOperador(String operador) {
        Operador = operador;
    }



    public int getCantidadMinutos() {
        return CantidadMinutos;
    }



    public void setCantidadMinutos(int cantidadMinutos) {
        CantidadMinutos = cantidadMinutos;
    }



    public int getValorminuto() {
        return Valorminuto;
    }



    public void setValorminuto(int valorminuto) {
        Valorminuto = valorminuto;
    }



    public int getCostoPlan() {
        calcularCostoPlan();
        return CostoPlan;
    }



    public void setCostoPlan(int costoPlan) {
        CostoPlan = costoPlan;
    }

    public void calcularCostoPlan(){
        
    }
  
}
