package boletin9_5;
//Yasmin

import java.util.Scanner;

public class NumerosPosiNega {

    int p, n, numero;

    public void numPosNeg() {
        Scanner num = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = num.nextInt();

        for (n = 1; n <= numero; n++) {
            if ((n % 2) != 0) {
                System.out.println(" -" + n);
            } else {
                System.out.println(" +" + n);

            }

        }
    }
}
