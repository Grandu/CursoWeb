
package javaya;
import java.util.Scanner;

public class T08_EstructuraCondicionalAnidada {
    
    public static void main(String[] ar) {
        Scanner teclado = new Scanner (System.in);
        int nota1, nota2, nota3, promedio;
        System.out.print("Primera nota: ");
        nota1 = teclado.nextInt();
        System.out.print("Segunda nota: ");
        nota2 = teclado.nextInt();
        System.out.print("Tercera nota: ");
        nota3 = teclado.nextInt();
        promedio = (nota1 + nota2 + nota3)/3;
        if (promedio >= 7 ){
            System.out.println("Promocionado!");
        } else {
            if (promedio >= 4) {
                System.out.println("Regular...");
                } else { 
                    System.out.println("Reprobado.");
                }
        }
        
    }
    
}
