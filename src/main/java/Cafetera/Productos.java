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
public enum Productos {
    CAFE_SOLO ("Cafe solo", 10,0,0,10),
    CAFE_LECHE ("Cafe con leche", 10,10,0,0),
    CAFE_LARGO ("Cafe largo", 17,0,0,3),
    CAFE_CORTADO ("Cafe cortado", 15,5,0,0),
    CHOCO ("Chocolate", 0,5,15,0),
    LECHE ("Leche", 0,20,0,0);
    
    private String nombre;
    private int cantidadCafe;
    private int cantidadLeche;
    private int cantidadChoco;
    private int cantidadAgua;

    private Productos(String nombre, int cantidadCafe, int cantidadLeche, int cantidadChoco,
            int cantidadAgua) {
        this.nombre = nombre;
        this.cantidadCafe = cantidadCafe;
        this.cantidadLeche = cantidadLeche;
        this.cantidadChoco = cantidadChoco;
        this.cantidadAgua = cantidadAgua;
    }

    public int getCantidadChoco() {
        return cantidadChoco;
    }

    public void setCantidadChoco(int cantidadChoco) {
        this.cantidadChoco = cantidadChoco;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadLeche() {
        return cantidadLeche;
    }

    public void setCantidadLeche(int cantidadLeche) {
        this.cantidadLeche = cantidadLeche;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(int cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }
    
    @Override
    public String toString() {
        return "Productos{" + "cantidadCafe=" + cantidadCafe + ", cantidadLeche=" + cantidadLeche + ", cantidadChoco=" + cantidadChoco + '}';
    }

    public String getNombre() {
        return nombre;
    }

    
    
    
    
    
}
