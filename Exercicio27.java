package exercicios;

import java.util.Scanner;

public class Exercicio23 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        double[] ex23 = new double[5];
        for (int i = 0; i < ex23.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            ex23[i] = sc.nextDouble();
        }
        System.out.print("Digite o número multiplicador: ");
        double multiplicador = sc.nextDouble();
        System.out.println("Valores multiplicados:");
        for (int i = 0; i < ex23.length; i++) {
            System.out.println(ex23[i] * multiplicador);
        }
    }
}
