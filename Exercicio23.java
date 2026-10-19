package exercicios;

import java.util.Scanner;

public class Exercicio19 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double[] ex19 = new double[5];
        for (int i = 0; i < ex19.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            ex19[i] = sc.nextDouble();
        }
        double temporario = ex19[0];
        ex19[0] = ex19[ex19.length - 1];
        ex19[ex19.length - 1] = temporario;
        System.out.println("Array alterado (primeiro e último trocados):");
        for (int i = 0; i < ex19.length; i++) {
            System.out.print(ex19[i] + " ");
        }
        System.out.println();
    }
}
