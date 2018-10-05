package javaya;
import java.util.Scanner;


public class T10_EstructuraRepetitivaWhile {
    
    public static void main (String[] ar) {
        int x;
        x = 1;
        while (x <= 100) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1 ;
        }
    }
}


/*
package javaya;
import java.util.Scanner;


public class T10_2EstructuraRepetitivaWhile {
    
    public static void main (String[] ar) {
        Scanner teclado = new Scanner (System.in);
        int x, n;
        x = 1;
        System.out.print("Indica el valor inicial: ");
        n = teclado.nextInt();
        while (x <= n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1 ;            
        }
    }
}
//
*/