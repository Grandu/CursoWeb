/*
Confeccionar un programa que permita cargar los nombres de 5 operarios 
y sus sueldos respectivos. Mostrar el sueldo mayor y el nombre del operario.
*/
package javaya;
import java.util.Scanner;

public class T19_PruebaVector {
    private Scanner teclado;
    private String[] nombres;
    private float[] sueldos;
    
    public void cargar() {
        teclado = new Scanner(System.in);
        nombres = new String[3];
        sueldos = new float[3];
        for (int f = 0; f < nombres.length; f++ ) {
            System.out.print("Indica el nombre del empleado: ");
            nombres[f] = teclado.next();
            System.out.print("Indica el sueldo: ");
            sueldos[f] = teclado.nextFloat();
        }
    }
    
    public void mayorSueldo() {
        float mayor;
        int pos;
        mayor=sueldos[0];
        pos=0;
        for(int f=1;f<nombres.length;f++) {
            if (sueldos[f]>mayor) {
                mayor=sueldos[f];
                pos=f;
            }
        }
        System.out.println("El empleado con sueldo mayor es "+nombres[pos]);
        System.out.println("Tiene un sueldo:"+mayor);
    }
    
    public static void main(String[] ar) {
        T19_PruebaVector pv=new T19_PruebaVector();
        pv.cargar();
        pv.mayorSueldo();
    }
}
