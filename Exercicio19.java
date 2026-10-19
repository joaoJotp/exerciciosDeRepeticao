package exercicios;

import java.util.Scanner;

public class Exercicio15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double[] ex15 = new double[5];
        for (int i = 0; i < ex15.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            ex15[i] = sc.nextDouble();
        }
        System.out.println("O dobro de cada valor:");
        for (int i = 0; i < ex15.length; i++) {
            System.out.println(ex15[i] * 2);
        }

    }

}
