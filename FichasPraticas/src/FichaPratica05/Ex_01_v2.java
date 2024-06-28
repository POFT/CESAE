package FichaPratica05;

import java.util.Scanner;

public class Ex_01_v2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int[] vetor = new int[10];

        //ler valor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira no Vetor["+i+"]: ");
            vetor[i] = input.nextInt();

        }
        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        //imprimir valor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor["+i+"] = "+ vetor[i]);

        }
    }
}
