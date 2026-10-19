package exercicios;

import java.util.Scanner;

public class Exercicio14 {
    static void main() {
            Scanner sc = new Scanner(System.in);


            double[] ex14 = new double[6];
            for (int i = 0; i < ex14.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                ex14[i] = sc.nextDouble();
            }
            System.out.println("Valores na ordem inversa:");
            for (int i = ex14.length - 1; i >= 0; i--) {
                System.out.println(ex14[i]);
            }

    }
}
