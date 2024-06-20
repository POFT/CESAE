package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro e imprima os números inteiros de 0 até este número.
        int inicio, fim;

        inicio = 0;

        System.out.print("Digite um numero: ");
        fim = input.nextInt();
        //Ex.caixa vai com 10
        // 10 <=20
        while (inicio <= fim){
            System.out.println(inicio);
            inicio = inicio + 1;
        }
    }
}
