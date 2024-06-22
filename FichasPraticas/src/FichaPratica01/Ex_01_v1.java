package FichaPratica01;

import java.util.Scanner;

public class Ex_01_v1 {
    public static void main(String[] args) {

        //Ex_01: Escreva um programa que faça a soma de dois números introduzidos pelo utilizador.
        //Apresente o resultado da operação.

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        int numero1, numero2, soma; //Declarar variaveis necessárias para o exercicio


        System.out.print("-Introduza um numero: "); //Pedir ao user o numero1
        numero1 = input.nextInt(); //Guardar input do user na variavel numero1

        System.out.print("-Introduza um numero: "); //Pedir ao user o numero2
        numero2 = input.nextInt(); //Guardar input do user na variavel numero2


        soma = numero1 + numero2; //Calcular soma e guardar valor na variavel soma
        System.out.println("-Soma: " + soma); //Apresentar o resultado da operação.

        //Fim do exercicio
    }
}
