/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafetera;

/**
 *
 * @author Gabriel
 */
public class Monedero {

    
    private  double saldoAcumulado;
    public static double saldoCliente;
        
    private static int numeroVentas = 0;

    public Monedero() {
        this.saldoAcumulado = 0;
        this.saldoCliente = 0;
    }
    
    public void introducirDinero(int saldoIntroducido){         
        this.saldoCliente += saldoIntroducido;
    }
    
    public void sumarSaldo(int saldoIntroducido){         
        this.saldoAcumulado += saldoCliente;
    }
    
    public void mostrarSaldo() {
            System.out.println("La cafetera ha recaudado: " + this.saldoAcumulado);
    }
    
     public static int getNumeroVentas() {
        return numeroVentas;
    }

    public static void setNumeroVentas(int aNumeroVentas) {
        numeroVentas = aNumeroVentas;
    }
    
    public double getSaldoAcumulado() {
        return saldoAcumulado;
    }

    public void setSaldoAcumulado(double saldoAcumulado) {
        this.saldoAcumulado = saldoAcumulado;
    }

    public static double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    
    
}
