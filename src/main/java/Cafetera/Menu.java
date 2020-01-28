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
public class Menu {
    
    private Deposito deposito;
    private Productos producto;
    private double saldo;
    private double ingreso;
    

    public Menu() {
    }

    public Menu(Deposito deposito, Productos producto, double saldo, double ingreso) {
        this.deposito = deposito;
        this.producto = producto;
        this.saldo = saldo;
        this.ingreso = ingreso;
    }
    
    public void Menu(){
        System.out.println("---------------------");
        System.out.println("---- Daw Coffee -----");
        System.out.println("---------------------");
        System.out.println("Selecciona un producto");
        System.out.println("1- Cafe solo");
        System.out.println("2- Cafe con leche");
        System.out.println("3- Cafe largo");
        System.out.println("4- Cafe cortado");
        System.out.println("5- Chocolate");
        System.out.println("6- Leche");
        System.out.println("---------------------");
    }
    
    
          
     
    
}
