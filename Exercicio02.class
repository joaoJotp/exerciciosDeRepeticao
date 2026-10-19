package exercicios;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int[][] transposta = new int[3][2];

        System.out.println("Digite os valores para a matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                transposta[j][i] = matriz[i][j]; // Cria a transposta em tempo de leitura
            }
        }

        System.out.println("\nMatriz Transposta (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
