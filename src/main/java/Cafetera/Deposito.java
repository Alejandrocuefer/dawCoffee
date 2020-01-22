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
    
    //Depositos cafe, leche, agua, chocolate, azucar
    
    public Deposito() {}

    public Deposito(double cantidadMax, double capacidadUmbral, double capacidadActual) {
        this.cantidadMax = 1000;
        this.capacidadUmbral = 100;
        this.capacidadActual = capacidadActual;
    }
    
    public void restarCantidadDeposito(int cantidad){
        this.capacidadActual -= cantidad;
    }
}
