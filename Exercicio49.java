package exercicios;

import java.util.Scanner;

public class Exercicio45 {
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

       
        for (int j = 0; j < 3; j++) {
            int temporario = matriz[0][j];
            matriz[0][j] = matriz[2][j];
            matriz[2][j] = temporario;
        }

        System.out.println("\nMatriz após trocar a linha 0 com a linha 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
