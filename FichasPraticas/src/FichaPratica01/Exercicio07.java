package FichaPratica01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        // Import Scanner - uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double Produto1, Produto2, Produto3, Resultado, Desconto;

        //Escreva um programa que requisite ao utilizador o preço de 3 produtos adquiridos.
        System.out.println("Qual é o valor do produto1?");
        Produto1 = input.nextDouble();

        System.out.println("Qual é o valor do produto2?");
        Produto2 = input.nextDouble();

        System.out.println("Qual é o valor do produto3?");
        Produto3 = input.nextDouble();

        // Apresente o valor a pagar, considerando que deverá ter um desconto de 10% sobre o total dos produtos
        Desconto = (Produto1 + Produto2 + Produto3) * 0.10;
        System.out.println("Desconto: " + Desconto);

        Resultado = (Produto1 + Produto2 + Produto3) * 0.90;
        System.out.println("O valor total c/desconto é: " + Resultado);

    }
}
