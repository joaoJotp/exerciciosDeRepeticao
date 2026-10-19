package exercicios;

import java.util.Scanner;

public class Exercicio20 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] ex20 = new int[6];
        for (int i = 0; i < ex20.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            ex20[i] = sc.nextInt();
        }
        boolean temRepetido = false;
        for (int i = 0; i < ex20.length; i++) {
            for (int j = i + 1; j < ex20.length; j++) {
                if (ex20[i] == ex20[j]) {
                    temRepetido = true;
                    break;
                }
            }
        }
        if (temRepetido) {
            System.out.println("Existe número repetido no array.");
        } else {
            System.out.println("Não existem números repetidos no array.");
        }
    }
}
