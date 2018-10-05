/*
Se desea guardar los sueldos de 5 operarios.
Según lo conocido deberíamos definir 5 variables si queremos tener en un 
cierto momento los 5 sueldos almacenados en memoria.
*/
package javaya;
import java.util.Scanner;


public class T16_PruebaVector {
    private Scanner teclado;
    private int[] sueldos;
	
    public void cargar() {
        teclado = new Scanner(System.in);
        sueldos = new int[5];
        for(int f = 0; f < 5; f++) {
            System.out.print("Ingrese valor de la componente:");
            sueldos[f] = teclado.nextInt();
        }	
    }
	
    public void imprimir() {
        for(int f = 0; f < 5; f++) {
            System.out.println(sueldos[f]);
        }
    }
	
    public static void main(String[] ar) {
        T16_PruebaVector pv = new T16_PruebaVector();
        pv.cargar();
        pv.imprimir();
    }
}
