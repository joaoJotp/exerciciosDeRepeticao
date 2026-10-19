package exercicios;

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nDigite o número multiplicador: ");
        int multiplicador = scanner.nextInt();

        System.out.println("\nMatriz multiplicada por " + multiplicador + ":");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matriz[i][j] * multiplicador) + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
