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
public class Cafetera {

    private Deposito depositoCafe;
    private Deposito depositoAgua;
    private Deposito depositoLeche;
    private Deposito depositoChocolate;
    private Deposito depositoAzucar;
    

    private Usuario admin;
    private Monedero monedero;

    //CONSTRUCTOR
    public Cafetera(Deposito depositoCafe, Deposito depositoAgua, Deposito depositoLeche,
            Deposito depositoChocolate, Deposito depositoAzucar, Usuario admin, Monedero monedero) {

        this.depositoCafe = depositoCafe;
        this.depositoLeche = depositoLeche;
        this.depositoChocolate = depositoChocolate;
        this.depositoAzucar = depositoAzucar;
        this.depositoAgua = depositoAgua;
        this.admin = admin;
        this.monedero = monedero;
    }

    //MÉTODOS
    public void inicializar() {
         int aux; 
        do{
          aux = Menu.menuPrincipal();            
        
        switch (aux) {
            case 1:
                this.venta();
                break;

            case 2:
                this.administrar();
                break;
        }
        }while(aux != 3);
    }

    public void venta() {

        Productos productoEscogido;

      
          //  int dineroIntroducido = Menu.menuIntroducirDinero();
         //   this.monedero.introducirDinero(dineroIntroducido);

          
            switch (Menu.menuProducto()) {
                case 1:
                    productoEscogido = Productos.CAFE_SOLO;
                    break;
                case 2:
                    productoEscogido = Productos.CAFE_LECHE;
                    break;
                case 3:
                    productoEscogido = Productos.CAFE_LARGO;
                    break;
               
                case 4:
                    productoEscogido = Productos.CAFE_CORTADO;
                    break;
                case 5:
                    productoEscogido = Productos.CHOCO;
                    break;
                case 6:
                    productoEscogido = Productos.LECHE;
                    break;
                default:
                    productoEscogido = Productos.CAFE_SOLO;
            }


        Menu.menuAzucar();
        
        
        
    }
    
    
    public boolean haySuficienteProducto(Productos productoEscogido){
        if (productoEscogido.getCantidadAgua() >= this.depositoAgua.getCapacidadActual()){
           return false;
        } 
        if (productoEscogido.getCantidadCafe() >= this.depositoCafe.getCapacidadActual()){
           return false;
        }
        if (productoEscogido.getCantidadLeche() >= this.depositoLeche.getCapacidadActual()){
           return false;
        }
        if (productoEscogido.getCantidadChoco() >= this.depositoChocolate.getCapacidadActual()){
           return false;
        }        
        return true;
    }

    public boolean haySuficienteSaldo(Productos productoEscogido) {

        return productoEscogido.getPrecio() <= this.monedero.getSaldoCliente();
    }

   

    //GETTERS & SETTERS
    public Deposito getDepositoCafe() {
        return depositoCafe;
    }

    public void setDepositoCafe(Deposito depositoCafe) {
        this.depositoCafe = depositoCafe;
    }

    public Deposito getDepositoLeche() {
        return depositoLeche;
    }

    public void setDepositoLeche(Deposito depositoLeche) {
        this.depositoLeche = depositoLeche;
    }

    public Deposito getDepositoChocolate() {
        return depositoChocolate;
    }

    public void setDepositoChocolate(Deposito depositoChocolate) {
        this.depositoChocolate = depositoChocolate;
    }

    public Deposito getDepositoAzucar() {
        return depositoAzucar;
    }

    public void setDepositoAzucar(Deposito depositoAzucar) {
        this.depositoAzucar = depositoAzucar;
    }

    public Deposito getDepositoAgua() {
        return depositoAgua;
    }

    public void setDepositoAgua(Deposito depositoAgua) {
        this.depositoAgua = depositoAgua;
    }

    public Usuario getAdmin() {
        return admin;
    }

    public void setAdmin(Usuario admin) {
        this.admin = admin;
    }

    public Monedero getMonedero() {
        return monedero;
    }

    public void setMonedero(Monedero monedero) {
        this.monedero = monedero;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "depositoCafe=" + depositoCafe + ", depositoLeche=" + depositoLeche + ", depositoChocolate=" + depositoChocolate + ", depositoAzucar=" + depositoAzucar + ", depositoAgua=" + depositoAgua + ", admin=" + admin + ", monedero=" + monedero + '}';
    }

}
