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
    CAFE_SOLO (1,"Cafe solo", 10,0,0,10),
    CAFE_LECHE (2,"Cafe con leche", 10,10,0,0),
    CAFE_LARGO (3,"Cafe largo", 17,0,0,3),
    CAFE_CORTADO (4,"Cafe cortado", 15,5,0,0),
    CHOCO (5,"Chocolate", 0,5,15,0),
    LECHE (6,"Leche", 0,20,0,0);
    
    private int codigoProducto;
    private String nombre;
    private int cantidadCafe;
    private int cantidadLeche;
    private int cantidadChoco;
    private int cantidadAgua;
    private int precio;

    private Productos(int codigoProducto, String nombre, int cantidadCafe, int cantidadLeche, int cantidadChoco,
            int cantidadAgua) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.cantidadCafe = cantidadCafe;
        this.cantidadLeche = cantidadLeche;
        this.cantidadChoco = cantidadChoco;
        this.cantidadAgua = cantidadAgua;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getCantidadChoco() {
        return cantidadChoco;
    }

    public void setCantidadChoco(int cantidadChoco) {
        this.cantidadChoco = cantidadChoco;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(int cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
