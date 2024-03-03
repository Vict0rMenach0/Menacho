package Menacho;

import java.util.Scanner;

public class Menacho {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Escriba el primer número: ");
        int numero1 = teclado.nextInt();
        
        System.out.print("Escriba el segundo número: ");
        int numero2 = teclado.nextInt();
        
        int resul = numero1 + numero2;
        
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resul);
    }
}