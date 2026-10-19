package exercicios;

import java.util.Scanner;

public class Exercicio12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double outroNumero;
        double[] numeros = new double[8];
        boolean isencontrado = false;
        outroNumero = numeros[0];
        for(int i = 0 ; i < numeros.length ; i++){
            System.out.println("Digite o número:");
            numeros[i]= sc.nextDouble();
        }
        System.out.println("Digite o número que você procura");
        outroNumero = sc.nextDouble();

        for (int l = 0 ; l < numeros.length; l++){
            if (numeros[l] == outroNumero){
                isencontrado = true;
                System.out.println(" o numero encontrado na posição" + l);
            }
        } if (isencontrado == false){
            System.out.println("Não existe esse número na array");
        }
    }
}
