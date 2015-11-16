package boletin9_5;
//Yasmin

import java.util.Scanner;

public class NumerosPares {

    int contador, numero;

    public void serieNumeros() {
        Scanner np = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = np.nextInt();
        for (contador = 2; contador <= numero; contador++) {

            if ((contador % 2) == 0) {
                System.out.println(" " + contador);
            }
        }
    }
}