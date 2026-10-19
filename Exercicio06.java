package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int [6];
        for(int i = 0;  i < idades.length; i++){
            System.out.println("Digite sua idade:");
            idades[i] = sc.nextInt();
        }
        System.out.println("As idades digitadas foram:");
        for (int l = 0; l < idades.length; l++){
            System.out.print(idades[l] + " ");
        }
    }
}
