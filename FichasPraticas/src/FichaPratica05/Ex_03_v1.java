package FichaPratica05;

import java.util.Scanner;

public class Ex_03_v1 {
    public static void main(String[] args) {
//Ex_03. Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento.
        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maior;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        maior=vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("Maior Elemento: " + maior);


    }
}