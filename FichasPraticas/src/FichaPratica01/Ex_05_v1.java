package FichaPratica01;

import java.util.Scanner;

public class Ex_05_v1 {
    public static void main(String[] args) {
        //Ex_05: Escreva um programa que determine a média aritmética de um conjunto de 3 valores introduzidos pelo utilizador.
            // Como calcular media Aritemetica? é a soma dos valores a dividir total dos elementos.
        // Tendo em consideração os valores introduzidos, deverá também apresentar a média ponderada considerando as seguintes ponderações: 20%, 30%, 50%.
            // Como calcular media ponderada? é multiplcar pelo valor ponderado.

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        // Declarar variaveis necessárias para o exercicio
        double valor1, valor2, valor3, mediaAritemetica, mediaPonderada;

        System.out.print("- Introduza um valor: "); // Pedir ao user o valor1
        valor1 = input.nextDouble(); // Guardar input do user na variavel valor1
        System.out.print("- Introduza outro valor: "); // Pedir ao user o valor2
        valor2 = input.nextDouble(); // Guardar input do user na variavel valor2
        System.out.print("- Introduza outro valor: "); // Pedir ao user o valor3
        valor3 = input.nextDouble(); // Guardar input do user na variavel valor3

        // Calcular e guardar os valores nas respetivas variaveis
        mediaAritemetica = (valor1 + valor2 + valor3) / 3;
        mediaPonderada =  (valor1 * 0.20) + (valor2 * 0.30) + (valor3 * 0.50);

        // Apresentar o resultado das operações
        System.out.print("- Média aritemética: " + mediaAritemetica);
        System.out.print("- Média ponderada: " + mediaPonderada);

        // Fim do exercicio.
    }
}
