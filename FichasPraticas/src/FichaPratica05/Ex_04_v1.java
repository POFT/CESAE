package FichaPratica05;

import java.util.Scanner;

public class Ex_04_v1 {
    public static void main(String[] args) {
 //Ex_04. Escreva um programa que lê um array de tamanho 10 e encontra o menor elemento.

        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int[] vetor = new int[3];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira um valor["+i+"]: ");
            vetor[i] = input.nextInt();

        }
        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[0] > vetor[i]){
                vetor[0] = vetor[i];
            }
        }
        System.out.println("O número menor é "+ vetor[0]);
        //Imprimir o maior o valor do vetor[0]
        //Se o numero no vetor[0] > que o numero no vetor[1]
        //Se o numero no vetor[0] > que o numero no vetor[2]
        //Se o numero no vetor[0] > que o numero no vetor[3]
    }
}
