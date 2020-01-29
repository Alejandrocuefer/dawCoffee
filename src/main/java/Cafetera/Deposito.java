/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafetera;

/**
 *
 * @author alex
 */
public class Deposito {
    
    private double cantidadMax;
    private double capacidadUmbral;
    private double capacidadActual;
    private EnumDepositos deposito;
    
    //Depositos cafe, leche, agua, chocolate, azucar
    
    public Deposito() {
        this.cantidadMax = 1000;
        this.capacidadUmbral = 100;
        this.capacidadActual = 1000;
        this.deposito = deposito;
    }

    public Deposito(double cantidadMax, double capacidadUmbral, double capacidadActual,
            EnumDepositos deposito) {
        this.cantidadMax = cantidadMax;
        this.capacidadUmbral = capacidadUmbral;
        this.capacidadActual = capacidadActual;
        this.deposito = deposito;
    }
    
    public void restarCantidadDeposito(int cantidad){
        if(this.capacidadActual <= capacidadUmbral){
            System.out.println("Rellenar pronto el deposito");
        }
        this.capacidadActual -= cantidad;
    }
    
    public void rellenarCantidadDeposito(){
        this.capacidadActual = this.cantidadMax;
    }
    
    public void mostrarCantidadDeposito(){
        System.out.println("La cantidad actual es: " + this.capacidadActual);
    }

    public double getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(double cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public double getCapacidadUmbral() {
        return capacidadUmbral;
    }

    public void setCapacidadUmbral(double capacidadUmbral) {
        this.capacidadUmbral = capacidadUmbral;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public EnumDepositos getDeposito() {
        return deposito;
    }

    public void setDeposito(EnumDepositos deposito) {
        this.deposito = deposito;
    }
    
}
