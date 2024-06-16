package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, operacao, resultado;

        //ler numeros reais
        System.out.print("Introduza um número: ");
        num1 = input.nextDouble();
        System.out.print("Introduza um número: ");
        num2 = input.nextDouble();

        //ler operacao aritemetica
        System.out.println("Digite o simbolo de acordo com aperação a realizar, somar(+), subtrair(-), multiplicar(*), dividir(/): ");
        operacao = input.nextDouble();
        //dados do tipo char armazenam (num byte) um único caractere. Delimita-se com '...' (plicas)


        // Executar a operacao de acordo com o simbolo
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Somar: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Subtrair: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Multiplicar: " + resultado);
                break;
            case '/':
                resultado = num1 / num2;
                System.out.println("Dividir " + resultado);
                break;
            default:
                System.out.println("Escolheu outra opção!");
                break;

        }

    }
}
