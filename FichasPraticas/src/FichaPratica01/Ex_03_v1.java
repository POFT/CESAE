package FichaPratica01;

import java.util.Scanner;

public class Ex_03_v1 {
    public static void main(String[] args) {
        //Ex_03: Escreva um programa que calcule e apresente a área e o perímetro de um retângulo.
            // Para este exercicio basta calcular o produto entre a sua base e a sua altura, ou seja, a área é dada pela fórmula A=b⋅h.
            // Além da área, outra grandeza importante é o perímetro.
            // Para calcular o perímetro de um retângulo, deve-se somar os seus quatro lados.
        // As dimensões devem ser requisitadas ao utilizador.



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
