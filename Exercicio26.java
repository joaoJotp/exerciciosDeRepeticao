package exercicios;

import java.util.Scanner;

public class Exercicio22 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] comp1 = new int[5];
        int[] comp2 = new int[5];
        System.out.println("Valores para o primeiro array:");
        for (int i = 0; i < comp1.length; i++) {
            System.out.print("Posição " + i + ": ");
            comp1[i] = sc.nextInt();
        }
        System.out.println("Valores para o segundo array:");
        for (int i = 0; i < comp2.length; i++) {
            System.out.print("Posição " + i + ": ");
            comp2[i] = sc.nextInt();
        }
        boolean iguais = true;
        for (int i = 0; i < 5; i++) {
            if (comp1[i] != comp2[i]) {
                iguais = false;
                break;
            }
        }
        if (iguais) {
            System.out.println("Os dois arrays são iguais.");
        } else {
            System.out.println("Os dois arrays são diferentes.");
        }

    }
}
