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
    }
}
