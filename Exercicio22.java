package exercicios;

import java.util.Scanner;

public class Exercicio18 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double[] notas18 = new double[6];
        for (int i = 0; i < notas18.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas18[i] = sc.nextDouble();
        }
        double maior = notas18[0];
        double menor = notas18[0];
        double somaNotas = notas18[0];
        for (int i = 1; i < notas18.length; i++) {
            if (notas18[i] > maior) {
                maior = notas18[i];
            }
            if (notas18[i] < menor) {
                menor = notas18[i];
            }
            somaNotas += notas18[i];
        }
        double media = somaNotas / notas18.length;
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Média da turma: " + media);

    }
}
