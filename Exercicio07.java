package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numeros [] = new int[5];
        int soma = 0;
        for(int i = 0; i < numeros.length; i ++){
            System.out.println("Digite um número");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }
        System.out.println(" O resultado é :");
        System.out.println(soma);
        }
    }

