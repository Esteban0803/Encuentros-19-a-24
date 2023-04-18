//Realizar una clase llamada Persona en el paquete de entidades que tengan 
//los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. 
//Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.

//En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:

//Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.

//Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y 
//después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, 
//es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje

//Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
//Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
//Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
//Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.

//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada 
//objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal 
//e indicar para cada objeto si la persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), 
//para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima
package Service;
import Entidad.Personas;
import java.util.Scanner;

public class PersonaServicio {
    private char sexo;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Personas crearPersonas() {
        Personas p1 = new Personas();
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona");
        p1.setEdad(leer.nextInt());
        leer.nextLine(); 
        System.out.println("Ingrese el sexo (H/M/O)");
        p1.setSexo(leer.next());
        while (p1.getSexo().charAt(0) != 'H' && p1.getSexo().charAt(0) != 'M' && p1.getSexo().charAt(0) != 'O') {
        System.out.println("El sexo introducido no es correcto. Introduce H, M o O.");
        System.out.print("Introduce el sexo de la persona (H/M/O): ");
        p1.setSexo(leer.next());
        }
        System.out.println("Ingrese el peso de la persona");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona");
        p1.setAltura(leer.nextDouble());
        return p1;
    }

    public boolean esMayorDeEdad(int edad) {
        if (edad < 18) {
            return false;
        } else {
            return true;
        }
    }

    public int calcularIMC(double peso, double altura) {
        int result;
        result = 0;
        double a = altura;
        double t = peso / (a * a);
        if (t < 20) {
            return -1;
        } else if (t > 25) {
            return 1;
        } else {
            return 0;
        }
    }
}
