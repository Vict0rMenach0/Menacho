package Menacho;

import java.util.Scanner;

public class Menacho {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduzca el primer número: ");
        int numero1 = teclado.nextInt();
        
        System.out.print("Introduzca el segundo número: ");
        int NUMERO2 = teclado.nextInt();
        
        int resultado = numero1 + NUMERO2;
        
        System.out.println("La suma de " + numero1 + " y " + NUMERO2 + " es: " + resultado);
    }
}