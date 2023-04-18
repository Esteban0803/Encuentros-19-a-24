//Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
//Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
//Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
//Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
//simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
//El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
//Método vaciarCafetera(): pone la cantidad de café actual en cero. 
//Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
package ej2;
import Service.Servicio;
import java.util.Scanner;

public class EJ2 {
    private static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        Servicio s1 = new Servicio();
        boolean valor = true;
        do{
            System.out.println("Que desea hacer?");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("5. Salir");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    s1.llenarCafetera();
                break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza");
                    int taza = leer.nextInt();
                    s1.servirTaza(taza);
                break;
                case 3:
                    s1.vaciarCafetera();
                    break;
                case 4:
                    s1.agregarCafe();
                    break;
                case 5:
                    valor = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
        }
        }while (valor);
    }
}
