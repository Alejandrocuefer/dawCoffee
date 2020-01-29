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
public enum EnumDepositos {
    
    CAFE (1000, 150, 1000), 
    AGUA (1000, 150, 1000), 
    LECHE (1000, 150, 1000), 
    AZUCAR (1000, 150, 1000), 
    CHOCOLATE (1000, 150, 1000);
    
    private int capacidadMax;
    private double capacidadUmbral;
    private double capacidadActual;

    private EnumDepositos(int capacidadMax, double capacidadUmbral, double capacidadActual) {
        this.capacidadMax = capacidadMax;
        this.capacidadUmbral = capacidadUmbral;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
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
    
    
    
    
}
