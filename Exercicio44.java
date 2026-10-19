package exercicios;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonal = 0;

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("\nA soma dos valores da diagonal principal é: " + somaDiagonal);
        scanner.close();
    }
}
