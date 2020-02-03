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

    //ATRIBUTOS
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
    //En este método mostramos el menú principal con las dos opciones principales,
    //el programa solo acaba cuando pulsamos el 3
    public void inicializar() {
        int aux;
        do {
            aux = Menu.menuPrincipal();

            switch (aux) {
                case 1:
                    this.venta();
                    break;

                case 2:
                    this.administrar();
                    break;
            }
        } while (aux != 3);
    }

    //Este método es el que se encarga principalmente de la venta en sí
    //y va llamando a los 
    public void venta() {

        double dineroIntroducido = Menu.menuPagar();
        this.monedero.introducirDinero(dineroIntroducido);
        boolean esDescafeinado = false;
        int cantidadAzucar;

        Productos productoElegido = elegirProducto();
        if(productoElegido != null){
            
           if (haySuficienteSaldo(productoElegido)) {                      
             cantidadAzucar = cantidadAzucar();            
                        
           if (productoElegido != Productos.LECHE && productoElegido != Productos.CHOCO){
              esDescafeinado  = Menu.menuDescafeinado();
           }
           
           if (haySuficienteProducto(productoElegido, cantidadAzucar)){
               
               cogerIngredientes(productoElegido, cantidadAzucar);
               
               Menu.comprado(productoElegido.getNombre(), esDescafeinado);
               monedero.sumarSaldo();
               monedero.setSaldoCliente(0);                       
           }                        
           } else {          
                introducirMasDinero();
           }
        } 
   }

    public Productos elegirProducto() {
        int aux;
        boolean salir = false;
        Productos productoElegido = null;
        do {
            aux = Menu.menuProducto();

            switch (aux) {

                case 1:
                    productoElegido = Productos.CAFE_SOLO;
                    return productoElegido;
               
                case 2:
                    productoElegido = Productos.CAFE_LECHE;
                    return productoElegido;
                
                case 3:
                    productoElegido = Productos.CAFE_LARGO;
                    return productoElegido;
               
                case 4:
                    productoElegido = Productos.CAFE_CORTADO;
                    return productoElegido;
                 
                case 5:
                    productoElegido = Productos.CHOCO;
                    return productoElegido;
                 
                case 6:
                    productoElegido = Productos.LECHE;
                    return productoElegido;                 
                case 7:
                    salir = true;
                    break;
            }

        } while (!salir);

        return productoElegido;
    }
    
    public void cogerIngredientes(Productos productoEscogido, int cantidadAzucar){
        
                depositoCafe.rellenarCantidadDeposito(productoEscogido.getCantidadCafe());
                depositoAgua.rellenarCantidadDeposito(productoEscogido.getCantidadCafe());
                depositoLeche.rellenarCantidadDeposito(productoEscogido.getCantidadCafe());
                depositoAzucar.rellenarCantidadDeposito(cantidadAzucar);
                depositoChocolate.rellenarCantidadDeposito(productoEscogido.getCantidadCafe());
        
    }

    public boolean haySuficienteProducto(Productos productoEscogido, int cantidadAzucar) {
        if (productoEscogido.getCantidadAgua() >= this.depositoAgua.getCapacidadActual()) {
            return false;
        }
        if (productoEscogido.getCantidadCafe() >= this.depositoCafe.getCapacidadActual()) {
            return false;
        }
        if (productoEscogido.getCantidadLeche() >= this.depositoLeche.getCapacidadActual()) {
            return false;
        }
        if (productoEscogido.getCantidadChoco() >= this.depositoChocolate.getCapacidadActual()) {
            return false;
        }
        if (cantidadAzucar >= this.depositoAzucar.getCapacidadActual()) {
            return false;
        }
        return true;
    }

    public boolean haySuficienteSaldo(Productos productoEscogido) {

        return productoEscogido.getPrecio() <= this.monedero.getSaldoCliente();
    }
    
    public int cantidadAzucar(){
        int aux;        
        int cantidadAzucar;
       
            aux = Menu.menuAzucar();
            
            switch(aux){
                
                case 1:
                    cantidadAzucar = 0;
                    break;
                case 2:
                    cantidadAzucar = 2;
                    break;
                case 3:
                    cantidadAzucar = 4;
                    break;
                default:
                    cantidadAzucar = 0;
            }
            
            return cantidadAzucar;
        
    }

    public void introducirMasDinero() {

        int aux = Menu.saldoInsuficiente();

        do {
            switch (aux) {
                case 1:
                    Menu.menuPagar();
                    break;
                case 2:
                    break;
                default:
                    aux = 2;
                    break;
            }
        } while (aux != 2);
    }

    public void administrar() {
        String user = Menu.menuLogInUsuario();
        String password = Menu.menuLogInPassword();

        if (user.equals(this.admin.getUserName()) && password.equals(this.admin.getPassword())) {

            int aux;

            do {
                aux = Menu.menuAdministrar();

                switch (aux) {

                    case 1:
                        comprobarDeposito();
                        break;
                    case 2:
                        comprobarEstadoGeneral();
                        break;

                    case 3:
                        monedero.mostrarSaldo();
                        break;
                    case 4:
                        rellenarDepositos();
                        break;
                }

            } while (aux != 5);
        }

    }

    public void comprobarDeposito() {

        Deposito depositoAComprobar = elegirDeposito();

        depositoAComprobar.mostrarInfoDeposito();

    }

    public void comprobarEstadoGeneral() {

        admin.mostrarUsuario();
        depositoCafe.mostrarInfoDeposito();
        depositoLeche.mostrarInfoDeposito();
        depositoAgua.mostrarInfoDeposito();
        depositoAzucar.mostrarInfoDeposito();
        depositoChocolate.mostrarInfoDeposito();

    }

    public void consultarSaldoAcumulado() {

        monedero.mostrarSaldo();

    }

    public void rellenarDepositos() {

        Deposito depositoARellenar = elegirDeposito();

        int aux = Menu.menuRellenar();

        switch (aux) {

            case 1:
                depositoARellenar.rellenarDeposito();
                break;

            case 2:

                depositoARellenar.rellenarCantidadDeposito(Menu.menuRellenarCantidad());
                break;
        }
    }

    public Deposito elegirDeposito() {
        int aux;
        Deposito depositoElegido;
        boolean salir = false;
        do {
            aux = Menu.menuDepositos();

            switch (aux) {

                case 1:
                    depositoElegido = depositoCafe;
                    return depositoElegido;
                case 2:
                    depositoElegido = depositoAgua;
                    return depositoElegido;
                case 3:
                    depositoElegido = depositoLeche;
                    return depositoElegido;
                case 4:
                    depositoElegido = depositoAzucar;
                    return depositoElegido;
                case 5:
                    depositoElegido = depositoChocolate;
                    return depositoElegido;
                case 6:
                    salir = true;
                    return depositoElegido = null;
                default:
                    depositoElegido = depositoCafe;
                    return depositoElegido;
            }

        } while (aux != 6);

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
