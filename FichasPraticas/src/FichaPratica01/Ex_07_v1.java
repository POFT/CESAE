package FichaPratica01;

import java.util.Scanner;

public class Ex_07_v1 {
    public static void main(String[] args) {
        //Ex_07: Escreva um programa que requisite ao utilizador o preço de 3 produtos adquiridos.
        // Apresente o valor a pagar, considerando que deverá ter um desconto de 10% sobre o total dos produtos.

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        // Declarar variaveis necessárias para o exercicio
        double preco1, preco2, preco3, desconto, valorPagar;


        // Pedir ao user os valores/preço e guardar input do user nas respetivas variaveis
        System.out.print("- Introduza o preço 1: ");
        preco1 = input.nextDouble();
        System.out.print("- Introduza o preço 2: ");
        preco2 = input.nextDouble();
        System.out.print("- Introduza o preço 3: ");
        preco3 = input.nextDouble();

        //Calcular valor a pagar com o desconto 0.10
        desconto = (preco1 + preco2 + preco3) * 0.10;
        valorPagar = (preco1 + preco2 + preco3) * 0.90;

        // Apresentar o resultado das operações
        System.out.println("Desconto 10%: " + desconto + "€");
        System.out.println("Valor a pagar: " + valorPagar + "€");


        // Fim do exercicio.
    }
}
