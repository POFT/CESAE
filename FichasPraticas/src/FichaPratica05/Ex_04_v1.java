package FichaPratica05;

import java.util.Scanner;

public class Ex_04_v1 {
    public static void main(String[] args) {
 // Ex_04. Escreva um programa que lê um array de tamanho 10 e encontra o menor elemento
        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int menor;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        menor=vetor[0]; //Necessário declarar desta forma a variavel para considerar numeros negativos

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("Menor Elemento: " + menor);


    }
}