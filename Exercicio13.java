package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        for(int i = 0 ; i < numeros.length; i++){
            System.out.println("Digite um número:");
            numeros[i] = sc.nextDouble();
        }
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < 0){
                System.out.println(numeros[i] + " é um número negativos");
            } else if (numeros[i] == 0) {
                System.out.println(numeros[i] + " é um número igual a zero");
            }else {
                System.out.println(numeros[i] + " é um número positivo");
            }
        }
    }


}
