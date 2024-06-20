package FichaPratica03;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //Faça um programa que leia dois números inteiros, representando os valores início e fim de um intervalo e imprima os números inteiros neste intervalo.
        //Declarar variaveis
        int inicio, fim;

        System.out.print("Introduza um número de início: ");
        inicio = input.nextInt();

        System.out.print("Introduza um número de fim: ");
        fim = input.nextInt();

        //Este programa imprime os numeros no intervalo do "inicio" até ao "fim".
        while (inicio <= fim) {
            System.out.println(inicio);
            inicio = inicio + 1;
        }

    }
}
