package FichaPratica05;

import java.util.Scanner;

public class Ex_06_v1 {
    public static void main(String[] args) {
        //Ex_06. Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente

        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int[] vetor = new int[10];
        boolean crescente = true;


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("- Insira no vetor["+ i +"]: ");
            vetor[i] = input.nextInt();
            //Ex.1 vetor [0] = 3
            //Ex.2 vetor [1] = 2
            //Ex.3 vetor [2] = 1
        }
        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        for (int i = 1; i < vetor.length; i++) {
            if(vetor[i]<= vetor[i-1]){
                crescente=false;
            }
        }

        if(crescente){
            System.out.println("Crescente");
        }else{
            System.out.println("Não crescente");
        }
    }
}
