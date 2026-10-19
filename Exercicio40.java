package exercicios;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        System.out.println("Digite os valores para a matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < 4; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Coluna " + j + ": " + somaColuna);
        }
        scanner.close();
    }
}
