package FichaPratica02;

import java.util.Scanner;

public class Ex_03_v1 {
    public static void main(String[] args) {
        //Ex_03: Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
        // a. Salário até 15.000€ inclusive paga taxa de 20%
        // b. Salário de 15.000€ a 20.000€ inclusive paga taxa de 30%
        // c. Salário de 20.000€ a 25.000€ inclusive paga taxa de 35%
        // d. Salário superior a 25.000€ paga taxa de 40%

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        double salarioAnual, taxa; //numeros reais(double) porque o calculo da taxa pode não ser um valor inteiro.

        System.out.print("- Introduza o seu salário anual: "); //Pedir ao user o salario anual
        salarioAnual = input.nextDouble(); //Guardar input do user na variavel salarioAnual


        if (salarioAnual <= 15000) { // SE(if) o salarioAnual é menor ou igual (<=) ao valor de 15000,
            taxa = salarioAnual * 0.20;
            System.out.print("Paga taxa de 20%: " + taxa + "€"); // ENTÃO o Sistema imprime o calculo da taxa 20% (variavel taxa).
        }
        if (salarioAnual > 15000 && salarioAnual <= 20000) { // SE(if) o salarioAnual é maior (>) a 15000 e(&&) é menor ou igual(<=) a 20000,
            taxa = salarioAnual * 0.30;
            System.out.print("Paga taxa de 30%: " + taxa + "€"); // ENTÃO o Sistema imprime o calculo da taxa 30% (variavel taxa).
        }
        if (salarioAnual > 20000 && salarioAnual <= 25000) { // SE(if) o salarioAnual é maior (>) a 20000 e(&&) é menor ou igual(<=) a 25000,
            taxa = salarioAnual * 0.35;
            System.out.print("Paga taxa de 35%: " + taxa + "€"); // ENTÃO o Sistema imprime o calculo da taxa 35% (variavel taxa).
        }
        if (salarioAnual > 25000) { // SE(if) o salarioAnual é maior ao valor de 15000,
            taxa = salarioAnual * 0.40;
            System.out.print("Paga taxa de 40%: " + taxa + "€"); // ENTÃO o Sistema imprime o calculo da taxa 40% (variavel taxa).
        }
        //Fim do exercicio
    }
}
