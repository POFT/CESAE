package FichaPratica01;

import java.util.Scanner;

public class Ex_02_v1 {
    public static void main(String[] args) {
        //Ex_02: Escreva um programa que requisite dois valores.
        // O programa deverá utilizá-los como operandos para as seguintes operações aritméticas:
        // soma, subtração, multiplicação e divisão.
        // Apresente o resultado das operações e teste os resultados obtidos com vários casos.

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        int numero1, numero2, soma, subtracao, multiplicacao, divisao; // Declarar variaveis necessárias para o exercicio


        System.out.print("- Introduza um numero: "); // Pedir ao user o numero1
        numero1 = input.nextInt(); // Guardar input do user na variavel numero1

        System.out.print("- Introduza um numero: "); // Pedir ao user o numero2
        numero2 = input.nextInt(); // Guardar input do user na variavel numero2

        // Calcular e guardar os valores nas respetivas variaveis
        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;
        divisao = numero1 / numero2;

        // Apresentar o resultado das operações
        System.out.println("- Soma: " + soma);
        System.out.println("- Subtracao: " + subtracao);
        System.out.println("- Multiplicacao: " + multiplicacao);
        System.out.println("- Divisao: " + divisao);

        //Fim do exercicio
    }
}
