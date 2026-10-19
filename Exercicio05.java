package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0 ; i < nomes.length; i++ ){
            System.out.println("Digite os nomes:");
            nomes[i] = sc.nextLine();}
        System.out.println("Os nomes digitados foram:");
        for (int l = 0 ; l < nomes.length; l++){
            System.out.print(nomes[l] + " ");
        }

    }
}
