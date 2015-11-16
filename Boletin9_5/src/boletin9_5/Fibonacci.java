package boletin9_5;
//Yasmin

import java.util.Scanner;

public class Fibonacci {

    int numero, i, num1, num2;

    public void serieFibo() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce un número: ");
            numero = sc.nextInt();
        } while (numero <= 1);
        System.out.println("Los " + numero + " primeros números de la serie de Fibonacci son:");

        num1 = 0;
        num2 = 1;

        System.out.println(num1 + " ");
        for (i = 2; i <= numero; i++) {
            System.out.print(num2 + " ");
            num2 = num1 + num2;
            num1 = num2 - num1;
        }
        System.out.println();
    }
}