/*
Se tiene la siguiente información:
· Nombres de 4 empleados.
· Ingresos en concepto de sueldo, cobrado por cada empleado, en los últimos 
    3 meses.
Confeccionar el programa para:

a) Realizar la carga de la información mencionada. 
b) Generar un vector que contenga el ingreso acumulado en sueldos en los últimos 
    3 meses para cada empleado.
c) Mostrar por pantalla el total pagado en sueldos a todos los empleados en los 
    últimos 3 meses 
d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado
 */
package javaya;
import java.util.Scanner;

public class T24_Matriz {
    private Scanner teclado;
    private String[] empleados;
    private int[][] sueldos;
    private int[] sueldostot;
    
    public void cargar() {
        teclado = new Scanner(System.in);
        empleados = new String[4];
        sueldos = new int[4][3];
        for(int f=0;f<empleados.length;f++){
            System.out.print("Ingrese el nombre del empleado:");
            empleados[f]=teclado.next();
            for(int c=0;c<sueldos[f].length;c++) {
                System.out.print("Ingrese sueldo:");
                sueldos[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void calcularSumaSueldos() {
    	sueldostot = new int[4];
        for(int f=0;f<sueldos.length;f++) {
          int suma=0;
          for(int c=0;c<sueldos[f].length;c++) {
              suma=suma+sueldos[f][c];
          }
          sueldostot[f]=suma;
        }
    }
    
    public void imprimirTotalPagado() {
    	System.out.println("Total de sueldos pagados por empleado.");
        for(int f=0;f<sueldostot.length;f++) {
            System.out.println(empleados[f]+" - "+sueldostot[f]);
        }
    }
    
    public void empleadoMayorSueldo() {
        int may=sueldostot[0];
        String nom=empleados[0];
        for(int f=0;f<sueldostot.length;f++) {
            if (sueldostot[f]>may) {
                may=sueldostot[f];
                nom=empleados[f];
            }
        }
        System.out.println("El empleado con mayor sueldo es "+ nom + " que tiene un sueldo de "+may);
    }
    
    public static void main(String[] ar){
        T24_Matriz ma=new T24_Matriz();
        ma.cargar();
        ma.calcularSumaSueldos();
        ma.imprimirTotalPagado();
        ma.empleadoMayorSueldo();
    }
}
