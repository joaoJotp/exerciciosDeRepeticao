package exercicios;

import java.util.Scanner;

public class Exercicio13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;
        int numeroProcurado;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Digite o número procurado: ");
        numeroProcurado = sc.nextInt();
        for (int l = 0; l < numeros.length; l++) {
            if (numeros[l] == numeroProcurado) {
                System.out.println("O numero procurado está na posição: " + l + " e o número é " + numeros[l]);
                contador++;
            }
        }
        System.out.println("O número aparece " + contador + " vezes no array.");
        sc.close();
    }
}
