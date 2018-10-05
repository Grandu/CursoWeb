/*
Confeccionar una clase que permita carga el nombre y la edad de una persona. 
Mostrar los datos cargados. Imprimir un mensaje si es mayor de edad (edad>=18)
*/
package javaya;
import java.util.Scanner;

public class T14_Persona {
    private Scanner teclado;
    private String nombre;
    private int edad;
    
    public void inicializar () {
        teclado = new Scanner(System.in);
        System.out.print("Indica el nombre: ");
        nombre = teclado.next();
        System.out.print("Indica la edad: ");
        edad = teclado.nextInt();
    }
    
    public void imprimir () {
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
    public void esMayorEdad() {
        if (edad >= 18) {
            System.out.println(nombre+" es mayor de edad.");
        } else {
            System.out.println(nombre+" NO es mayor de edad.");
        }
    }
    
    public static void main (String [] ar) {
        T14_Persona persona1;
        persona1 = new T14_Persona();
        persona1.inicializar();
        persona1.imprimir();
        persona1.esMayorEdad();
    }
}
