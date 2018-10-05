package javaya;
import java.util.Scanner;


public class T11_EstructuraRepetitivaFor {
    
    public static void main (String[] ar ) {
        int f;
        for (f = 1; f <= 100; f++) {
            System.out.print(f);
            System.out.print(" - ");
        }
    }
}

/*
package javaya;
import java.util.Scanner;

public class T11_2EstructuraRepetitivaFor {
    
    public static void main (String[] ar) {
        int f, suma, valor, promedio;
        Scanner teclado = new Scanner (System.in);
        suma = 0;
        for (f = 1; f <= 5; f++) {
            System.out.print("Indica el valor: ");
            valor = teclado.nextInt();
            suma = suma + valor;
        }
        System.out.print("La suma es: ");
        System.out.println(suma);
        promedio = suma / 5;
        System.out.println("El promedio es: ");
        System.out.print(promedio);
    }
}

*/