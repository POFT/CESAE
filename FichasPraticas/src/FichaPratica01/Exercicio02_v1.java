package FichaPratica01;

import java.util.Scanner;

public class Exercicio02_v1 {
    public static void main(String[] args) {

        // Import Scanner - "uso sempre que precisar de ler coisas do teclado"
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, resultado;

        // Ler num1
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Introduza um número: ");
        num2 = input.nextInt();


        // Somar num1 e num2
        resultado = num1 + num2;

        // Apresentar e resultado
        System.out.println("Soma: " + resultado);


        // Subtrair num1 e num2
        resultado = num1 - num2;

        // Apresentar e resultado
        System.out.println("Subtracao: " + resultado);


        // Multiplicar num1 por num2
        resultado = num1 * num2;

        // Apresentar e resultado
        System.out.println("Multiplicacao: " + resultado);


        // Dividir num1 por num2
        resultado = num1 / num2;

        // Apresentar e resultado
        System.out.println("Divisao: " + resultado);


    }
}
