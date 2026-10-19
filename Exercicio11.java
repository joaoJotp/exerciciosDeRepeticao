package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int [10];
        for(int i = 0;  i < numeros.length; i++){
            System.out.println("Digite os numeros:");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Os numeros pares foram:");
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0 ){
                System.out.println(numeros[i]);
            }
        }
    }

}
