/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafetera;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Menu {

    public static int menuPrincipal() {
        Scanner teclado = new Scanner(System.in);
        int opcionMenuPrincipal;
        do {
            System.out.println("-------------------------");
            System.out.println("-Bienvenido a daw coffee-");
            System.out.println("-------------------------");
            System.out.println("-- 1.Comprar productos --");
            System.out.println("---- 2.Administrador ----");
            System.out.println("-------------------------");
            System.out.println("-------- 3.Salir --------");
            System.out.println("-------------------------");
            opcionMenuPrincipal = teclado.nextInt();
        } while (opcionMenuPrincipal > 3 || opcionMenuPrincipal < 1);

        return opcionMenuPrincipal;
    }
    
    public static double menuPagar() {
        Scanner teclado = new Scanner(System.in);
        double opcionMenuPagar;
        do {
            System.out.println("--------------------------");
            System.out.println("-- Introduzca el dinero --");
            System.out.println("--------------------------");
            System.out.println("--:                     --");
            System.out.println("--------------------------");
            System.out.println("--------- 3.Salir --------");
            System.out.println("--------------------------");
            opcionMenuPagar = teclado.nextInt();
        } while (opcionMenuPagar > 0.50);

        return opcionMenuPagar;
    }
    
    public static int saldoInsuficiente() {
        Scanner teclado = new Scanner(System.in);
        int opcionSaldoInsuficiente;
        System.out.println("----------------------------------------------------");
        System.out.println("-----Saldo insuficiente el mínimo es 0,50 (leche)----");
        System.out.println("---------------- ¿Introducir más? ------------------");
        System.out.println("---------------------- 1. Si ------------------------");
        System.out.println("------------------- 2. No (salir) --------------------");
        System.out.println("----------------------------------------------------");
        opcionSaldoInsuficiente = teclado.nextInt();
        return opcionSaldoInsuficiente;
    }

    public static int menuProducto() {
        Scanner teclado = new Scanner(System.in);
        int opcionMenuProducto;
        do {
            System.out.println("------------------------");
            System.out.println("------ Daw Coffee ------");
            System.out.println("------------------------");
            System.out.println("-Selecciona un producto-");
            System.out.println("------------------------");
            System.out.println("------ 1.Cafe solo------");
            System.out.println("--- 2.Cafe con leche ---");
            System.out.println("----- 3- Cafe largo ----");
            System.out.println("---- 4.Cafe cortado ----");
            System.out.println("------ 5.Chocolate -----");
            System.out.println("-------- 6.Leche -------");
            System.out.println("------------------------");
            System.out.println("-------- 7.Salir -------");
            System.out.println("------------------------");
            opcionMenuProducto = teclado.nextInt();
        } while (opcionMenuProducto > 7 || opcionMenuProducto < 1);
        return opcionMenuProducto;
    }

    public static int menuAzucar() {
        Scanner teclado = new Scanner(System.in);
        int opcionMenuAzucar;
        do {
            System.out.println("------------------------");
            System.out.println("-Seleccione la cantidad-");
            System.out.println("-------de azucar--------");
            System.out.println("------------------------");
            System.out.println("------- 1.Ninguna ------");
            System.out.println("------- 2.Poca ---------");
            System.out.println("------- 3.Mucha --------");
            System.out.println("------------------------");
            opcionMenuAzucar = teclado.nextInt();
        } while (opcionMenuAzucar > 3 || opcionMenuAzucar < 1);
        return opcionMenuAzucar;
    }

    public static String menuLogInUsuario() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("--Inserte sus credenciales--");
        System.out.println("----------------------------");
        System.out.println("-- Usuario:               --");
        System.out.println("----------------------------");
        String opcionMenuLogInUsuario = teclado.nextLine();
        return opcionMenuLogInUsuario;
    }

    public static String menuLogInPassword() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("--Inserte sus credenciales--");
        System.out.println("----------------------------");
        System.out.println("-- Contraseña:          ----");
        System.out.println("----------------------------");
        String opcionMenuLogInPassword = teclado.nextLine();
        return opcionMenuLogInPassword;
    }

    public static void logIncorrecto() {
        System.out.println("Usuario o contraseña incorrectos.");
    }

    public static int menuDepositos() {
        Scanner teclado = new Scanner(System.in);
        int opcionMenuDepositos;
        do {
            System.out.println("------------------------");
            System.out.println("------- Depositos ------");
            System.out.println("------------------------");
            System.out.println("-------- 1.Cafe --------");
            System.out.println("-------- 2.Agua --------");
            System.out.println("-------- 3.Leche -------");
            System.out.println("------- 4.Azucar -------");
            System.out.println("------ 5.Chocolate -----");
            System.out.println("------------------------");
            System.out.println("-------- 6.Salir -------");
            System.out.println("------------------------");
            opcionMenuDepositos = teclado.nextInt();
        } while (opcionMenuDepositos > 6 || opcionMenuDepositos < 1);
        return opcionMenuDepositos;
    }

    public static int menuAdministrar() {
        Scanner teclado = new Scanner(System.in);
        int opcionMenuAdministrar = 0;

        do {

            try {

                System.out.println("---------------------------");
                System.out.println("-------- Depositos --------");
                System.out.println("---------------------------");
                System.out.println("- 1.Comprobar depositos -");
                System.out.println("-- 2.Comprobar estados --");
                System.out.println("--- 3.Comprobar saldo ----");
                System.out.println("-------- 4.Rellenar --------");
                System.out.println("---------------------------");
                System.out.println("---------- 5.Salir ---------");
                System.out.println("---------------------------");
                opcionMenuAdministrar = teclado.nextInt();

            } catch (IllegalArgumentException iae) {
                System.out.println("Introduzca la opcion en formato numerico");
                opcionMenuAdministrar = 430;
            }
        } while (opcionMenuAdministrar > 5 || opcionMenuAdministrar < 1);
        return opcionMenuAdministrar;
        
    }

    public static int menuDescafeinado() {
        Scanner teclado = new Scanner(System.in);
        int opcionMenuAzucar;
        do {
            System.out.println("------------------------");
            System.out.println("---- ¿Descafeinado? ---");
            System.out.println("------------------------");
            System.out.println("---------- 1.Si ---------");
            System.out.println("--------- 2.No ---------");
            System.out.println("------------------------");
            opcionMenuAzucar = teclado.nextInt();
        } while (opcionMenuAzucar > 2 || opcionMenuAzucar < 1);
        return opcionMenuAzucar;
    }
    
    public static int menuSaldo() {
        Scanner teclado = new Scanner(System.in);
        int opcionMenuSaldo;
        do {
            System.out.println("-------------------------");
            System.out.println("-No hay suficiente saldo-");
            System.out.println("-------------------------");
            System.out.println("---- 1.Introducir más ---");
            System.out.println("--------- 2.Salir --------");
            System.out.println("-------------------------");
            opcionMenuSaldo = teclado.nextInt();
        } while (opcionMenuSaldo > 2 || opcionMenuSaldo < 1);

        return opcionMenuSaldo;
    }
    
    public static int menuRellenar() {
        Scanner teclado = new Scanner(System.in);
        int opcionMenuRellenar;
        do {
            System.out.println("--------------------------");
            System.out.println("-¿Cómo quieres rellenar?-");
            System.out.println("--------------------------");
            System.out.println("------- 1. Entero --------");
            System.out.println("---- 2. Con x cantidad ---");
            System.out.println("--------------------------");
            opcionMenuRellenar = teclado.nextInt();
        } while (opcionMenuRellenar > 2 || opcionMenuRellenar < 1);

        return opcionMenuRellenar;
    }
    
    public static int menuRellenarCantidad() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("---- Inserte la cantidad ----");
        System.out.println("----------------------------");
        System.out.println("-- :                               --");
        System.out.println("----------------------------");
        int opcionMenuRellenarCantidad = teclado.nextInt();
        return opcionMenuRellenarCantidad;
    }
    
    public static void comprado(String nomProducto)  {
        System.out.println("Aqui tiene su " + nomProducto + ", gracias por su compra");
    }
    


}
