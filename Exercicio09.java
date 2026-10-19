package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[6];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o numero:");
            numeros[i] = sc.nextDouble();
        }
        double maior = numeros[0];


        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
    }
    }

