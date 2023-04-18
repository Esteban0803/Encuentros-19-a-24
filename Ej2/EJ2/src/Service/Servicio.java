//Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
//Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
//Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
//Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
//simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
//El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
//Método vaciarCafetera(): pone la cantidad de café actual en cero. 
//Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
package Service;
import Entidad.Cafetera;
import java.util.Scanner;

public class Servicio {
    private static Scanner leer = new Scanner(System.in);
    Cafetera cafe = new Cafetera();
    
    public void llenarCafetera(){
        cafe.setCapAct(cafe.getCapMax());
        System.out.println("Su cafereta se ha llenado. Con "+cafe.getCapMax()+ "ml");
        System.out.println("--------------");
        System.out.println(" ");
    }
    public void servirTaza(int tamañoTaza){
        int taza = 0;
        int coffee = cafe.getCapMax();
        if (taza < coffee){
            System.out.println("Su taza se llenó, queda " + coffee + " de cafe.");     
        }else{
            taza = taza - coffee;
            System.out.println("No hay suficiente cafe como para llenar su taza. Solo se llego a servir: " + taza);
        }
        System.out.println("--------------");
        System.out.println(" ");
    }
    public void vaciarCafetera(){
        System.out.println("Quiere vaciar su cafetera?");
        String respuesta = leer.nextLine();
        if (respuesta.equals("si")){
            System.out.println("Su taza se ha vaciado");
            cafe.setCapAct(0);
        }else{
            respuesta.equals("no");
            System.out.println("Su cafetera no se vaciara");
        }
        System.out.println("--------------");
        System.out.println(" ");
    }
    public void agregarCafe(){
        System.out.println("Cuanto cafe desea ingresar?");
        cafe.setCapAct(leer.nextInt());
        System.out.println("La cantidad se ingreso correctamente");
        System.out.println("--------------");
        System.out.println(" ");
    }
}
