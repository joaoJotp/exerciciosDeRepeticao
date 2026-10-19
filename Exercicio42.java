package exercicios;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[4];
        double[][] notas = new double[4][3];

        System.out.println("Cadastro de nomes dos 4 alunos:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nome do " + (i + 1) + "º aluno: ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\nCadastro das 3 notas para cada aluno:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Notas de " + nomes[i] + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n--- BOLETIM FINAL ---");
        for (int i = 0; i < 4; i++) {
            double soma = 0;
            System.out.print("Aluno: " + nomes[i] + " | Notas: [ ");
            for (int j = 0; j < 3; j++) {
                System.out.print(notas[i][j] + " ");
                soma += notas[i][j];
            }
            double media = soma / 3.0;
            String situacao = (media >= 6.0) ? "Aprovado" : "Reprovado";
            System.out.printf("] | Média: %.2f | Situação: %s\n", media, situacao);
        }
        scanner.close();
    }
}
