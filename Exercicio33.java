package exercicios;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];

        System.out.println("Cadastre 5 produtos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();
        }

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Listar todos os produtos");
            System.out.println("2. Buscar produto pelo nome");
            System.out.println("3. Mostrar quantidade de produtos cadastrados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\nProdutos cadastrados:");
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println("- " + produtos[i]);
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome do produto que deseja buscar: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < produtos.length; i++) {
                        if (produtos[i].equalsIgnoreCase(busca)) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("Produto encontrado no sistema!");
                    } else {
                        System.out.println("Produto NÃO encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("\nQuantidade de produtos cadastrados: " + produtos.length);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
