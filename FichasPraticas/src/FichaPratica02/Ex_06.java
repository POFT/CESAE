package FichaPratica02;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int valor1, valor2;

        // Solicitar valores ao utilizador
        System.out.print("Introduza um número: ");
        valor1 = input.nextInt();

        System.out.print("Introduza um número: ");
        valor2 = input.nextInt();

        //Escreva um programa que leia dois valores numéricos e apresente o maior e depois o menor.
        if (valor1 > valor2) {
            System.out.print(valor1 + "\t" + valor2);
        }else{
            System.out.print(valor2 + "\t" + valor1);
        }


    }
}
