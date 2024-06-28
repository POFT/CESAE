package FichaPratica05;

import java.util.Scanner;

public class Ex_10_v1 {
    public static void main(String[] args) {
        //Ex_10. Faça um programa que preencha cada posição de uma matriz 3x5 com valores inteiros introduzidos pelo utilizador.
        // Deverá depois ler um outro valor do utilizador e indicar quantos vezes existe na matriz

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int[ ][ ] matriz = new int[3][5];
        int quantidade=0;

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
            }
        }
        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        //imprime somatorio de todos os valores:
        System.out.println("Soma: " + quantidade);
    }
}