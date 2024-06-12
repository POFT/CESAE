package FichaPratica01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        // Import Scanner - "uso sempre que precisar de ler coisas do teclado"
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, soma, subtracao, multiplicacao, divisao;

        // ler num1
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        // ler num2
        System.out.print("Introduza um número: ");
        num2 = input.nextInt();

        // Somar num1 e num2
        soma = num1 + num2;

        // Subtrair num1 e num2
        subtracao = num1 - num2;

        // Multiplicar num1 por num2
        multiplicacao = num1 * num2;

        // Dividir num1 por num2
        divisao = num1 / num2;

        // Apresentar e resultado
        System.out.println("Soma: " + soma);

        // Apresentar e resultado
        System.out.println("Subtracao: " + subtracao);

        // Apresentar e resultado
        System.out.println("Multiplicacao: " + multiplicacao);

        // Apresentar e resultado
        System.out.println("Divisao: " + divisao);

    }


}
