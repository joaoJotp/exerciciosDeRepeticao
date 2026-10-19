package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double media;
        double soma = 0;
        for (int i = 0 ; i < notas.length; i++){
            System.out.println("Digite as notas:");
            notas[i] = sc.nextDouble();
            soma += notas[i];

        }
        System.out.println("A media do aluno é:");
        System.out.println(media = soma / notas.length);


    }
}
