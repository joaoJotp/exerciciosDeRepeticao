package exercicios;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[6];

        System.out.println("Digite 6 nomes:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\nNomes com mais de 5 letras:");
        for (int i = 0; i < 6; i++) {
            if (nomes[i].length() > 5) {
                System.out.println(nomes[i]);
            }
        }
        scanner.close();
    }
}
