package exercicios;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[6];
        int contador = 0;

        System.out.println("Digite 6 nomes:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        for (int i = 0; i < 6; i++) {
           
            if (!nomes.isEmpty() && (nomes[i].charAt(0) == 'A' || nomes[i].charAt(0) == 'a')) {
                contador++;
            }
        }

        System.out.println("\nQuantidade de nomes que começam com a letra A: " + contador);
        scanner.close();
    }
}
