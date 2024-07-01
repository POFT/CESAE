package FichaPratica05;

import javax.swing.*;
import java.util.Scanner;

public class Ex_08_v1 {
    public static void main(String[] args) {
        //Ex_08. Implemente um programa que permita adicionar 9 números inteiros (ler input do utilizador) a uma matriz 3x3 e que os imprima com o seguinte aspeto gráfico

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int[ ][ ] matriz = new int[3][3];

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

            }
            System.out.println(); //Aplica um Enter
        }
    }
}
