package FichaPratica05;

import java.util.Scanner;

public class Ex_03_v2 {
    public static void main(String[] args) {
 //Ex_03. Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento.

        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int[] vetor = new int[10];
        int maior=0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira um valor["+i+"]: ");
            vetor[i] = input.nextInt();

        }
        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        for (int i = 0; i < vetor.length; i++) {
            if (maior < vetor[i]){
                maior = vetor[i];
            }
        }
        System.out.println("O número maior é "+ maior);
        //Imprimir o maior o valor

    }
}
