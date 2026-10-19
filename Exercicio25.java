package exercicios;

import java.util.Scanner;

public class Exercicio21 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] somaArray = new int[5];
        System.out.println("Valores para o primeiro array:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Posição " + i + ": ");
            array1[i] = sc.nextInt();
        }
        System.out.println("Valores para o segundo array:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Posição " + i + ": ");
            array2[i] = sc.nextInt();
            somaArray[i] = array1[i] + array2[i];
        }
        System.out.println("Array com a soma das posições correspondentes:");
        for (int i = 0; i < somaArray.length; i++) {
            System.out.println("Posição " + i + ": " + somaArray[i]);
        }
    }
}
