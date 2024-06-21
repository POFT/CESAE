package FichaPratica03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Escreva um programa que leia uma sequência de números inteiros do utilizador e determine se a sequência
        //está em ordem crescente.

        //Declarar variaveis
        int inicio=1, countUser, numUser=0,guardarValor=0;

        // Solicitar ao user o numero de repetições
        System.out.println("Quantos numeros pretende introduzir?");
        countUser = input.nextInt(); //Ex. 5


        while (inicio <= countUser){
            System.out.println("Introduza um número:");
            numUser = input.nextInt(); // Ex 1
            inicio = inicio + 1; // 1+1=2
            if (guardarValor == 0){
                guardarValor = numUser; //Ex_1
            }
        }
        if (guardarValor < numUser){
            System.out.println("Crescente");
        }else{
            System.out.println("Decrescente");
        }
    }
}
