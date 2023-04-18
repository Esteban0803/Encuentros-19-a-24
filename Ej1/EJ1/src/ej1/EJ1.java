//Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
//numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
//Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
//Método para crear cuenta pidiéndole los datos al usuario.
//Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
//Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
//Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
//Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
//Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
package ej1;
import Service.Servicio;
import ej1.Banco.CuentaBancaria;

public class EJ1 {
    public static void main(String[] args) {
        Servicio servicio = new Servicio();
        CuentaBancaria cuenta = servicio.crearCuenta();
        servicio.Ingresar(cuenta, 1000);
        servicio.Retirar(cuenta, 500);
        servicio.extraccionRapida(cuenta);
        servicio.consultarSaldo(cuenta);
        servicio.consultarDatos(cuenta);
    }
}
