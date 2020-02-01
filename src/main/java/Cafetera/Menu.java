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
        do{
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

    public static int menuDepositos() {
        Scanner teclado = new Scanner(System.in);
        int opcionMenuDepositos;
        do{
        System.out.println("------------------------");
        System.out.println("------- Depositos ------");
        System.out.println("------------------------");
        System.out.println("-------- 1.Cafe --------");
        System.out.println("-------- 2.Agua --------");
        System.out.println("-------- 3.Leche -------");
        System.out.println("------- 4.Azucar -------");
        System.out.println("------ 5.Chocolate -----");
        System.out.println("------------------------");
        System.out.println("-------- 7.Salir -------");
        System.out.println("------------------------");
        opcionMenuDepositos = teclado.nextInt();
        } while (opcionMenuDepositos > 7 || opcionMenuDepositos < 1);
        return opcionMenuDepositos;
    }

    public static int MenuDepositosAccion() {
        Scanner teclado = new Scanner(System.in);
        int opcionMenuDepositosAccion;
        do{
        System.out.println("------------------------");
        System.out.println("------- Depositos ------");
        System.out.println("------------------------");
        System.out.println("------ 1.Rellenar ------");
        System.out.println("- 2.Comprobar capacidad -");
        System.out.println("------------------------");
        System.out.println("-------- 3.Salir -------");
        System.out.println("------------------------");
        opcionMenuDepositosAccion = teclado.nextInt();
        } while (opcionMenuDepositosAccion > 3 || opcionMenuDepositosAccion < 1);
        return opcionMenuDepositosAccion;
    }

}
