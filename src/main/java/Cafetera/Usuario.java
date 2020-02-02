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
public class Usuario {
    
    private String userName;
    private String password;

    public Usuario(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    public void mostrarUsuario() {
        System.out.println("Su usuario es: " +  this.userName);
        System.out.println("Y su contraseña es: " +  this.password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
