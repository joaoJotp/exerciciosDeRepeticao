package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    static void main() {
        Scanner sc = new Scanner (System.in);
        byte materia;
        System.out.println("Digite a matéria:\n" +
                "1 - História\n" + "2 - Geografia\n" + "3 - Matemática\n"+ "4 -Educação Fisica\n");
        materia = sc.nextByte();
        switch (materia){
            case 1 :
                System.out.println("Você escolheu História");
                break;
            case 2:
                System.out.println("Você escolheu Geografia");
                break;
            case 3:
                System.out.println("Você escolheu Matemática:");
            case 4 :
                System.out.println("Você escolheu Educação Fisica");
        }

        double[] notas = new double[5];
        double media;
        double soma = 0;
        for(int i = 0 ; i < notas.length; i++){
            System.out.println("Digite as notas de 0 a 10:");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
            media = soma / notas.length;
            if (media >= 9){
                System.out.println("Excelente");
            } else if (media >= 6) {
                System.out.println("Muito Bom");
            } else if (media >=3){
                System.out.println("recuperação");
            } else {
                System.out.println("repetiu de ano");
            }
        }
    }

