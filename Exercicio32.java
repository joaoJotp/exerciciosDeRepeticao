package exercicios;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Digite a nota de " + nomes[i] + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer
        }

        System.out.println("\n--- Relatório de Alunos ---");
        for (int i = 0; i < 5; i++) {
            String situacao = (notas[i] >= 6.0) ? "Aprovado" : "Reprovado";
            System.out.println("Aluno: " + nomes[i] + " | Nota: " + notas[i] + " | Situação: " + situacao);
        }
        scanner.close();
    }
}
