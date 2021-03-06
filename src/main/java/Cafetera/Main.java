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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Crea los objetos necesarios
        Deposito depositoCafe = new Deposito(1000, 200, 500, EnumDepositos.CAFE);
        Deposito depositoAgua = new Deposito(1000, 200, 500, EnumDepositos.AGUA);
        Deposito depositoLeche = new Deposito(1000, 200, 500, EnumDepositos.LECHE);
        Deposito depositoChoco = new Deposito(1000, 200, 500, EnumDepositos.CHOCOLATE);
        Deposito depositoAzucar = new Deposito(1000, 200, 500, EnumDepositos.AZUCAR);

        Usuario admin = new Usuario("Pepe", "1234");
        Monedero monedero = new Monedero();
        //Crea la cafetera con los objetos creado previamente
        Cafetera cafetera = new Cafetera(depositoCafe, depositoAgua, depositoLeche, depositoChoco, depositoAzucar, admin, monedero);
        
        //Inicializamos todo el programa, a partir de ahora todo el flujo de ejecución va por la cafetera
        cafetera.inicializar();
    }

}
