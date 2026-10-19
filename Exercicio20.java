package exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ex16Original = new double[5];
        double[] ex16Dobros = new double[5];
        for (int i = 0; i < ex16Original.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            ex16Original[i] = sc.nextDouble();
            ex16Dobros[i] = ex16Original[i] * 2;
        }
        System.out.println("Valores do segundo array (dobrados):");
        for (int i = 0; i < ex16Dobros.length; i++) {
            System.out.println(ex16Dobros[i]);
        }
    }
}