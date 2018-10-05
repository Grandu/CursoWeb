/*
Desarrollar un programa que permita cargar 5 nombres de personas y 
sus edades respectivas. Luego de realizar la carga por teclado de todos los 
datos imprimir los nombres de las personas mayores de 
edad (mayores o iguales a 18 años)
*/
package javaya;
import java.util.Scanner;

public class T18_PruebaVector {
    private Scanner teclado;
    private String[] nombres;
    private int[] edades;
    
    public void cargar() {
        teclado = new Scanner(System.in);
        nombres = new String[5];
        edades = new int[5];
        for(int f = 0;f < nombres.length; f++) {
            System.out.print("Ingrese nombre:");
            nombres[f] = teclado.next();
            System.out.print("Ingrese edad:");
            edades[f] = teclado.nextInt();            
        }
    }    
    
    public void mayoresEdad() {
        System.out.println("Personas mayores de edad.");
    	for(int f = 0; f < nombres.length; f++) {
            if (edades[f]>=18) {
                System.out.println(nombres[f]);
            }
    	}    
    }
    
    public static void main(String[] ar) {
        T18_PruebaVector pv = new T18_PruebaVector();
        pv.cargar();
        pv.mayoresEdad();
    }    
}