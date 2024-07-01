package FichaPratica05;

import javax.swing.*;
import java.util.Scanner;

public class Ex_08_v1 {
    public static void main(String[] args) {
        //Ex_08. Implemente um programa que permita adicionar 9 números inteiros (ler input do utilizador) a uma matriz 3x3 e que os imprima com o seguinte aspeto gráfico

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Imprimir matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] +"\t|\t");
            }
            System.out.println();
        }

    }
}