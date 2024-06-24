package FichaPratica02;

import java.util.Scanner;

public class Ex_02_v2 {
    public static void main(String[] args) {

        //Ex_02: Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
            // a. Salário até 15.000€ inclusive paga taxa de 20%
            // b. Salário superior a 15.000€ paga taxa de 30%

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        // Declarar variáveis
        double salario, taxa;

        // ler salario
        System.out.print("Introduza um salario:");
        salario = input.nextDouble();


        // Pode existir mais do que uma solução,
        // neste exemplo alterei a condição de salario <= 15000 para salario > 15000,
        // mas continuo a imprimir o resultado esperado porque tambem alterei a resposta a imprimir.
        if (salario > 15000) {
            taxa = salario * 0.30;
            System.out.print("Paga taxa de 30%: " + taxa + "€");
        } else {
            taxa = salario * 0.20;
            System.out.print("Paga taxa de 20%: " + taxa + "€");
        }
        //Fim do exercicio
    }
}
