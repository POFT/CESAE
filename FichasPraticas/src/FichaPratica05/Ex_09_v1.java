package FichaPratica05;

import java.util.Scanner;

public class Ex_09_v1 {
    public static void main(String[] args) {
        //Ex_09. Escreva um programa que lê uma matriz de tamanho 5x5 e imprima a soma de todos os elementos
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int[ ][ ] matriz = new int[3][3];
        int soma=0;

        //Ler os valores
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.println("Insira um nº inteiro["+i+"]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        //imprime os valores inseridos
        for (int i = 0; i < matriz.length; i++){
            System.out.println();
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
                soma = soma + matriz[i][j];
            }
        }
        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        //imprime somatorio de todos os valores:
        System.out.println("Soma: " + soma);
    }
}
