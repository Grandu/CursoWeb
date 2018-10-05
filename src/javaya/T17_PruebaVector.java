/*
Se desea almacenar los sueldos de operarios. 
Cuando se ejecuta el programa se debe pedir la cantidad de sueldos a ingresar. 
Luego crear un vector con dicho tamaño.
*/
package javaya;
import java.util.Scanner;

public class T17_PruebaVector {
    private Scanner teclado;
    private int[] sueldos;
    
    
    public void cargar() {
        teclado = new Scanner(System.in);
        System.out.print("Indica la cantidad de sueldos: ");
        int cant;
        cant = teclado.nextInt();
        sueldos = new int[cant];
        for(int f = 0; f < sueldos.length; f++) {
            System.out.print("Indica el sueldo: ");
            sueldos[f] = teclado.nextInt();
        }	
    }
    
    public void imprimir () {
        for(int f = 0; f < sueldos.length; f++) {
            System.out.println(sueldos[f]);
        }
    }
    
    public static void main (String [] ar) {
        T17_PruebaVector pv = new T17_PruebaVector();
        pv.cargar();
        pv.imprimir();
    }
}


