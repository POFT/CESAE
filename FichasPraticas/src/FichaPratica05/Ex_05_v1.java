package FichaPratica05;

import java.util.Scanner;

public class Ex_05_v1 {
    public static void main(String[] args) {
        //Ex_05.Escreva um programa que lê um array de tamanho 10 e calcula a média dos elementos.

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double[] vetor = new double[10];
        double soma=0, media=0;


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("- Insira no Vetor["+ i +"]: ");
            vetor[i] = input.nextDouble();

        }
        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        //Calculo (somar os valores) e (dividir pelos elementos)
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i]; //Soma = soma + vetor na posição atual.
        }

        media = soma / vetor.length; //media = soma + a quantidade de vetores.
        System.out.println("Média: " + media); //imprimir valor média

    }
}
