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
        this.deposito = EnumDepositos.AGUA;
    }

    public Deposito(double cantidadMax, double capacidadUmbral, double capacidadActual,
            EnumDepositos deposito) {
        this.cantidadMax = cantidadMax;
        this.capacidadUmbral = capacidadUmbral;
        this.capacidadActual = capacidadActual;
        this.deposito = deposito;
    }

    public void restarCantidadDeposito(int cantidad) {
        if (this.capacidadActual <= capacidadUmbral && capacidadActual > cantidad) {
            System.out.println("Rellenar pronto el deposito");
            this.capacidadActual -= cantidad;
        } else if (capacidadActual <= cantidad) {
            System.out.println("No queda");
        } else {
            this.capacidadActual -= cantidad;
        }

    }

    public void rellenarDeposito() {
        this.capacidadActual = this.cantidadMax;
    }
    
    public void rellenarCantidadDeposito(int cantidad) {
        if (cantidad > (cantidadMax-capacidadActual)){
            System.out.println("te has colao'");
        } else {
            capacidadActual += cantidad;
        }
    }

    public void mostrarCantidadDeposito() {
        System.out.println("La cantidad actual es: " + this.capacidadActual);
    }

    public void mostrarInfoDeposito() {
        System.out.println("El deposito " + this.deposito + ", se encuentra con: ");
        if (this.capacidadActual <= capacidadUmbral) {
            System.out.println("La cantidad actual es: " + this.capacidadActual);
            System.out.println("Rellenar pronto el deposito");
        }

        System.out.println("La capacidad umbral es: " + this.capacidadUmbral);
        System.out.println("La capacidad máxima es: " + this.cantidadMax);
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

    @Override
    public String toString() {
        return "Deposito: " + "cantidadMax=" + cantidadMax + ", capacidadUmbral=" + capacidadUmbral + ", capacidadActual=" + capacidadActual + ", deposito=" + deposito;
    }

}
