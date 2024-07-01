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
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){ //[0] serve para isolar uma linha para saber quantas colunas tem. (sem aplicabilidade nos exercicios)
                System.out.println("- Insira um nº inteiro["+ linha +"]["+ coluna +"]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }// bate aqui e só avança depois de linha for igual ou valor definido para a matriz.

        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        //imprime os valores inseridos
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.print(matriz[linha][coluna] + "\t|\t");
                soma = soma + matriz[linha][coluna];
                //System.out.print(matriz[coluna] + "Soma" + soma);
            }
            System.out.println("\n Soma da linha: " + soma ); // (\n funciona como um enter, sout aplico apenas para ver a soma por linha.
        }

        System.out.println("\n"); // Linha apenas para separar

        //imprime somatorio de todos os valores:
        System.out.println("Soma: " + soma);
    }
}
