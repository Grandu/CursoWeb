/*
Se desea guardar los sueldos de 5 operarios en un vector. 
Realizar la creación y carga del vector en el constructor.
 */
package javaya;
import java.util.Scanner;

public class T26_Operarios {
    private Scanner teclado;
    private int[] sueldos;
	
    public T26_Operarios() {
        teclado=new Scanner(System.in);
        sueldos=new int[5];
        for(int f=0;f<5;f++) {
            System.out.print("Ingrese valor de la componente:");
            sueldos[f]=teclado.nextInt();
        }	
    }
	
    public void imprimir() {
        for(int f=0;f<5;f++) {
            System.out.println(sueldos[f]);
        }
    }
	
    public static void main(String[] ar) {
        T26_Operarios op=new T26_Operarios();
        op.imprimir();
    }
}