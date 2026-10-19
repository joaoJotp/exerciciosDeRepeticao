package exercicios;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notas = new double[4][3];

        System.out.println("Digite as 3 notas para cada um dos 4 alunos:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 4; i++) {
            double soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            System.out.printf("Aluno %d: Média = %.2f\n", (i + 1), media);
        }
        scanner.close();
    }
}
