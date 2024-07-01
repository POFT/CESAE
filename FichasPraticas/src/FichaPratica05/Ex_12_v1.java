package FichaPratica05;

import java.util.Scanner;

public class Ex_12_v1 {
    public static void main(String[] args) {

        //Ex_12. Escreva um programa que lê dois arrays de tamanho 10 e gera uma matriz 10x2 com os elementos da primeira junto aos elementos da segunda.

        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];
        int[ ][ ] matriz = new int[4][2];

        //ler array1
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("- (linha1) Insira um valor["+ i +"]: ");
            vetor1[i] = input.nextInt();

        }
        //ler array2
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("- (linha2) Insira um valor["+ i +"]: ");
            vetor1[i] = input.nextInt();
        }

        for (int linha = 0; linha < vetor2.length; linha++) {
            matriz[linha][0] = vetor1[linha];
            matriz[linha][0] = vetor2[linha];
        }

        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        //imprimir matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
        }


        System.out.println("\n__________________________________\n"); // Linha apenas para separar
    }
}
