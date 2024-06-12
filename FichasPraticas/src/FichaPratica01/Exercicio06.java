package FichaPratica01;

import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {

        // Import Scanner - uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor1, valor2;

        // ler valor1
        System.out.print("Introduza o valor 1: ");
        valor1 = input.nextInt();

        // ler valor2
        System.out.print("Introduza o valor 2: ");
        valor2 = input.nextInt();

        // somar o valor 1 com o valor 2, subtrair valor 1 por valor 2, subtrair valor 1 por valor 2
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        // Apresentar resultado trocado
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);




    }
}
