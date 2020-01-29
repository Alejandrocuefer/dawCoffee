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

    Scanner teclado = new Scanner(System.in);

    public void MenuPrincipal() {
        System.out.println("-------------------------");
        System.out.println("-Bienvenido a daw coffee-");
        System.out.println("-------------------------");
        System.out.println("-- 1.Comprar productos --");
        System.out.println("---- 2.Administrador ----");
        System.out.println("-------------------------");
        System.out.println("-------- 3.Salir --------");
        System.out.println("-------------------------");
        int opcionMenuPrincipal = teclado.nextInt();
    }

    public void MenuProducto() {
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
        int opcionMenuProducto = teclado.nextInt();
    }

    public void MenuAzucar() {
        System.out.println("------------------------");
        System.out.println("-Seleccione la cantidad-");
        System.out.println("-------de azucar--------");
        System.out.println("------------------------");
        System.out.println("------- 1.Poco ---------");
        System.out.println("------- 2.Normal -------");
        System.out.println("------- 3.Mucho --------");
        System.out.println("------------------------");
        System.out.println("------- 4. Volver ------");
        System.out.println("------------------------");
        int opcionMenuAzucar = teclado.nextInt();
    }

    public void MenuLogInUsuario() {
        System.out.println("----------------------------");
        System.out.println("--Inserte sus credenciales--");
        System.out.println("----------------------------");
        System.out.println("-- Usuario:               --");
        System.out.println("----------------------------");
        int opcionMenuLogInUsuario = teclado.nextInt();
    }

    public void MenuLogInPassword() {
        System.out.println("----------------------------");
        System.out.println("--Inserte sus credenciales--");
        System.out.println("----------------------------");
        System.out.println("-- Contraseña:          ----");
        System.out.println("----------------------------");
        int opcionMenuLogInPassword = teclado.nextInt();
    }

    public void MenuDepositos() {
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
        int opcionMenuDepositos = teclado.nextInt();
    }

    public void MenuDepositosAccion() {
        System.out.println("------------------------");
        System.out.println("------- Depositos ------");
        System.out.println("------------------------");
        System.out.println("------ 1.Rellenar ------");
        System.out.println("- 2.Comprobar capacidad -");
        System.out.println("------------------------");
        System.out.println("-------- 7.Salir -------");
        System.out.println("------------------------");
        int opcionMenuDepositosAccion = teclado.nextInt();
    }

}
