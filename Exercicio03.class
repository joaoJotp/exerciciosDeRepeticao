package exercicios;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] vendas = new double[3][4];
        double maiorTotal = -1;
        int melhorVendedor = -1;

        System.out.println("Digite as 4 vendas para cada um dos 3 vendedores:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Vendedor " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Venda " + (j + 1) + ": R$ ");
                vendas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n--- Relatório de Vendas ---");
        for (int i = 0; i < 3; i++) {
            double totalVendedor = 0;
            for (int j = 0; j < 4; j++) {
                totalVendedor += vendas[i][j];
            }
            System.out.printf("Total vendido pelo Vendedor %d: R$ %.2f\n", (i + 1), totalVendedor);

            if (totalVendedor > maiorTotal) {
                maiorTotal = totalVendedor;
                melhorVendedor = i + 1;
            }
        }

        System.out.println("\nO vendedor que vendeu mais foi o Vendedor " + melhorVendedor + " com um total de R$ " + maiorTotal);
        scanner.close();
    }
}
