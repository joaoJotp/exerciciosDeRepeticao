package exercicios;
import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] estoque = new int[3][5]; // 3 lojas, 5 produtos

        System.out.println("Digite a quantidade de cada produto em cada loja:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Loja " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Produto " + (j + 1) + ": ");
                estoque[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n--- RELATÓRIO DE ESTOQUE ---");

        // Total de produtos por loja
        int maiorEstoqueLoja = -1;
        int lojaComMaisProdutos = -1;

        for (int i = 0; i < 3; i++) {
            int totalLoja = 0;
            for (int j = 0; j < 5; j++) {
                totalLoja += estoque[i][j];
            }
            System.out.println("Total de produtos na Loja " + (i + 1) + ": " + totalLoja);

            if (totalLoja > maiorEstoqueLoja) {
                maiorEstoqueLoja = totalLoja;
                lojaComMaisProdutos = i + 1;
            }
        }

  
        System.out.println("\nTotal de cada produto (todas as lojas somadas):");
        for (int j = 0; j < 5; j++) {
            int totalProduto = 0;
            for (int i = 0; i < 3; i++) {
                totalProduto += estoque[i][j];
            }
            System.out.println("Produto " + (j + 1) + ": " + totalProduto + " unidades");
        }

        System.out.println("\nA loja com mais produtos no estoque é a Loja " + lojaComMaisProdutos + " (com " + maiorEstoqueLoja + " unidades no total).");
        scanner.close();
    }
}
