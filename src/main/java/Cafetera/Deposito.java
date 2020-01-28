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
    
    public Deposito() {
        this.cantidadMax = 1000;
        this.capacidadUmbral = 100;
        this.capacidadActual = 1000;
    }

    public Deposito(double cantidadMax, double capacidadUmbral, double capacidadActual) {
        this.cantidadMax = cantidadMax;
        this.capacidadUmbral = capacidadUmbral;
        this.capacidadActual = capacidadActual;
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
    
}
