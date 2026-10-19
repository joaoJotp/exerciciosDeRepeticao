package exercicios;

import java.util.Scanner;

public class Exercicio24 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Exercício 24: Somar apenas os pares ---");
        int[] ex24 = new int[10];
        int somaPares = 0;
        for (int i = 0; i < ex24.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            ex24[i] = sc.nextInt();
            if (ex24[i] % 2 == 0) {
                somaPares += ex24[i];
            }
        }
        System.out.println("A soma dos números pares é: " + somaPares);
    }
}
