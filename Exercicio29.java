package exercicios;

import java.util.Scanner;

public class Exercicio25 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Exercício 25: Somar apenas os ímpares ---");
        int[] ex25 = new int[10];
        int somaImpares = 0;
        for (int i = 0; i < ex25.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            ex25[i] = sc.nextInt();
            if (ex25[i] % 2 != 0) {
                somaImpares += ex25[i];
            }
        }
        System.out.println("A soma dos números ímpares é: " + somaImpares);
    }
}
