package exercicios;

import java.util.Scanner;


public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];
        int[] quantidades = new int[5];

        System.out.println("Cadastro de produtos e estoque (5 itens):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome do " + (i + 1) + "º produto: ");
            produtos[i] = scanner.nextLine();
            System.out.print("Quantidade em estoque de " + produtos[i] + ": ");
            quantidades[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        System.out.println("\nProdutos com estoque abaixo de 5 unidades:");
        boolean alerta = false;
        for (int i = 0; i < 5; i++) {
            if (quantidades[i] < 5) {
                System.out.println("- " + produtos[i] + " (" + quantidades[i] + " unidades)");
                alerta = true;
            }
        }
        if (!alerta) {
            System.out.println("Nenhum produto com estoque crítico.");
        }
        scanner.close();
    }
}
