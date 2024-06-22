package FichaPratica01;

import java.util.Scanner;

public class Ex_04_v1 {
    public static void main(String[] args) {
        //Ex_04: Escreva um programa para calcular a área da circunferência.
            // a area da circunferencia é calculada através da multiplicação do PI(3.14) por raio ao quadrado
        // As dimensões devem ser requisitadas ao utilizador.

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        // Declarar variaveis necessárias para o exercicio
        double raio, area;

        System.out.print("Introduza o valor do raio: "); // Pedir ao user o raio
        raio = input.nextDouble(); // Guardar input do user na variavel raio

        // Calcular e guardar os valores nas respetivas variaveis
        area = 3.14 * raio * raio;

        // Apresentar o resultado das operações
        System.out.println("Area da circunferência: " + area + "m2");


        // Fim do exercicio.
    }
}
