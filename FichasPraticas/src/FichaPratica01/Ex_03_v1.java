package FichaPratica01;

import java.util.Scanner;

public class Ex_03_v1 {
    public static void main(String[] args) {
        //Ex_03: Escreva um programa que calcule e apresente a área e o perímetro de um retângulo.
        // As dimensões devem ser requisitadas ao utilizador.
            // Algoritmo:
                // LER o valor de 2 lados, (comprimento e largura),
                // MULTIPLICAR os 2 valores, Área = lado A x lado B,
                // SOMAR os seus quatro lados, Perímetro = Lado A + Lado A + Lado B + Lado B,
                // APRESENTAR o resultado.



        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        // Declarar variaveis necessárias para o exercicio
        double comprimento, largura, area, perimetro;

        System.out.print("Introduza o comprimento (Distancia que se mede de uma ponta a outra): "); // Pedir ao user o comprimento
        comprimento = input.nextDouble(); // Guardar input do user na variavel comprimento

        System.out.print("Introduza a largura (Distância que é perpendicular ao comprimento): "); // Pedir ao user o largura
        largura = input.nextDouble(); // Guardar input do user na variavel largura

        // Calcular e guardar os valores nas respetivas variaveis
        area = comprimento * largura;
        perimetro = comprimento + largura + comprimento + largura; // ou (comprimento + largura) * 2;

        // Apresentar o resultado das operações
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

        //Fim do exercicio
    }
}
