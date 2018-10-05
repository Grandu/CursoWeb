/*
Se debe crear un vector donde almacenar 5 sueldos. 
Ordenar el vector sueldos de menor a mayor.
*/

package javaya;
import java.util.Scanner;

public class T20_PruebaVector {
    private Scanner teclado;
    private int[] sueldos;
    
    public void cargar() {
    teclado = new Scanner(System.in);
    sueldos = new int[3];
    for(int f = 0; f<sueldos.length; f++) {
        System.out.print("Ingrese el sueldo:");
        sueldos[f]=teclado.nextInt();
        }
    }
    
    public void ordenar() {
        for(int k = 0;k < 2; k++) {
            for(int f = 0; f < 2 -k; f++) {
                if (sueldos[f]>sueldos[f+1]) {
                    int aux;
                    aux = sueldos[f];
                    sueldos[f] = sueldos[f+1];
                    sueldos[f+1]=aux;
                }
            }
        }
    }
	
    public void imprimir() {
        System.out.println("Sueldos ordenados de menor a mayor.");
        for(int f = 0; f<sueldos.length; f++) {
            System.out.println(sueldos[f]);
        }
    }
	
    public static void main(String[] ar) {
        T20_PruebaVector pv=new T20_PruebaVector();
        pv.cargar();
        pv.ordenar();
        pv.imprimir();
    }
}
