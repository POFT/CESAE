package FichaPratica01;

import java.util.Scanner;

public class Ex_06_v1 {
    public static void main(String[] args) {
        //Ex_06: Escreva um programa que leia dois valores inteiros e os armazene na variáveis valor1 e valor2.
        // Permute o valor das variáveis e apresente o resultado.
        // De seguida, verifique se consegue efetuar esta troca sem criar variáveis adicionais

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        // Declarar variaveis necessárias para o exercicio
        int valor1, valor2;

        System.out.print("- Introduza um valor: "); // Pedir ao user o valor1
        valor1 = input.nextInt(); // Guardar input do user na variavel valor1
        System.out.print("- Introduza outro valor: "); // Pedir ao user o valor2
        valor2 = input.nextInt(); // Guardar input do user na variavel valor2

        // Calcular e guardar os valores nas respetivas variaveis
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        // Apresentar o resultado das operações
        System.out.println("- Valor 1: " + valor1);
        System.out.println("- Valor 2: " + valor2);

        // Fim do exercicio.
    }
}
