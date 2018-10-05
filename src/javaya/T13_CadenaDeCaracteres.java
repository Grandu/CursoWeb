/*
package javaya;
import java.util.Scanner;

public class T13_CadenaDeCaracteres {
    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);
        String nombre1,nombre2;
        int edad1,edad2;
        System.out.print("Ingrese el nombre:");
        nombre1 = teclado.next();
        System.out.print("Ingrese edad:");
        edad1 = teclado.nextInt();
        System.out.print("Ingrese el nombre:");
        nombre2 = teclado.next();
        System.out.print("Ingrese edad:");
        edad2 = teclado.nextInt();
        System.out.print("La persona de mayor edad es: ");
        if (edad1>edad2) {
            System.out.println(nombre1);
        } else {
            System.out.println(nombre2);
        }
    }
}
*/
package javaya;
import java.util.Scanner;

public class T13_CadenaDeCaracteres {
    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);
        String apenom1,apenom2;
        int edad1,edad2;
        System.out.print("Ingrese el apellido y el nombre:");
        apenom1 = teclado.nextLine();
        System.out.print("Ingrese edad:");
        edad1 = teclado.nextInt();
        System.out.print("Ingrese el apellido y el nombre:");
        teclado.nextLine();
        apenom2 = teclado.nextLine();
        System.out.print("Ingrese edad:");
        edad2 = teclado.nextInt();
        System.out.print("La persona de mayor edad es: ");
        if (edad1>edad2) {
            System.out.print(apenom1);
        } else {
            System.out.print(apenom2);
        }
    }
}
