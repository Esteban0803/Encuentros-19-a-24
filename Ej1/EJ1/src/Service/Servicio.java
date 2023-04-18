//Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
//numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
//Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
//Método para crear cuenta pidiéndole los datos al usuario.
//Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
//Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
//Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
//Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
//Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
//Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
package Service;

import ej1.Banco.CuentaBancaria;
import java.util.Scanner;

public class Servicio {

    public double retirar;
    Scanner leer = new Scanner(System.in);
    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el numero de cuenta");
        int numCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI de la persona");
        long dniCliente = leer.nextInt();
        System.out.println("Ingrese su salgo actual");
        double saldoActual = leer.nextInt();
        return new CuentaBancaria(numCuenta, dniCliente, saldoActual);
    }

    public void Ingresar(CuentaBancaria c1, double cantidad) {
        double saldoActual = c1.getSaldoActual();
        saldoActual += cantidad;
        c1.setSaldoActual(saldoActual);
        System.out.println("Se ha depositado $" + cantidad + " en la cuenta.");
    }

    public void Retirar(CuentaBancaria c1, double cantidad) {
        double saldoActual = c1.getSaldoActual();
        if (saldoActual >= cantidad) {
            saldoActual -= cantidad;
            c1.setSaldoActual(saldoActual);
            System.out.println("Se ha retirado $" + cantidad + " de la cuenta.");
        } else {
            double cantidadRetirada = saldoActual;
            saldoActual = 0;
            c1.setSaldoActual(saldoActual);
            System.out.println("No se pudo retirar $" + cantidad + ".");
            System.out.println("Se ha retirado $" + cantidadRetirada + " de la cuenta.");
        }
    }

    public void extraccionRapida(CuentaBancaria c1) {
        double saldoActual = c1.getSaldoActual();
        double maximoARetirar = saldoActual * 0.2;
        System.out.print("Ingrese cantidad a retirar (máximo $" + maximoARetirar + "): ");
        double cantidad = leer.nextDouble();
        if (cantidad <= maximoARetirar) {
            saldoActual -= cantidad;
            c1.setSaldoActual(saldoActual);
            System.out.println("Se ha retirado $" + cantidad + " de la cuenta.");
        } else {
            System.out.println("No se pudo retirar $" + cantidad + ".");
            System.out.println("El monto maximo a retirar $" + cantidad + ".");
        }
    }
    public void consultarSaldo(CuentaBancaria c1) {
        System.out.println("Sus saldo actual es: " + c1.getSaldoActual());
    }
     public void consultarDatos(CuentaBancaria c1) {
        System.out.println("Número de cuenta: " + c1.getNumCuenta());
        System.out.println("DNI del cliente: " + c1.getDniCliente());
        System.out.println("Saldo actual: " + c1.getSaldoActual());
    }
}
