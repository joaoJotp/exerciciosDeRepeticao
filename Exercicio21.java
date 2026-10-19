package exercicios;

import java.util.Scanner;

public class Exercicio17 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double[] notas17 = new double[8];
        int aprovados = 0;
        int reprovados = 0;
        for (int i = 0; i < notas17.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas17[i] = sc.nextDouble();
            if (notas17[i] >= 7.0) {
                aprovados++;
            } else {
                reprovados++;
            }
        }
        System.out.println("Aprovados: " + aprovados + " | Reprovados: " + reprovados);
    }
}
