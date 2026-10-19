package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        String nomePesquisado;
        for(int i = 0; i < nomes.length; i ++){
            System.out.println("Digite o seu nome:");
            nomes[i] = sc.nextLine();
        }
        System.out.println("Digite um nome para pesquisar:");
        nomePesquisado = sc.nextLine();
        for (int l = 0; l < nomes.length; l++){
            if(nomePesquisado.equals(nomes[l])){
                System.out.println("Tem esse nome");
            }
        }
    }
}
