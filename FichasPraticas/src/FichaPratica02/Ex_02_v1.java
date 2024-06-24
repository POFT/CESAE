package FichaPratica02;

import java.util.Scanner;

public class Ex_02_v1 {
    public static void main(String[] args) {

        //Ex_02: Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
        // a. Salário até 15.000€ inclusive paga taxa de 20%
        // b. Salário superior a 15.000€ paga taxa de 30%

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        double salario, taxa; //numeros reais(double) porque o calculo da taxa pode não ser um valor inteiro.

        System.out.println("- Introduza um salario: ");
        salario = input.nextDouble();

        if  (salario <= 15000){ // SE(if) o salario é menor ou igual(<=) aos 15000,
            taxa = salario * 0.20; // Calculo, a taxa é igual ao salario a multiplicar pelo valor taxa a aplicar(20%).
            System.out.println("- Paga taxa de 20%: " + taxa + "€"); // ENTÃO o Sistema imprime o calculo da taxa (variavel taxa),
        }else{ // SENÃO (else),
            taxa = salario * 0.30;
            System.out.println("- Paga taxa de 30%: " + taxa + "€"); // ENTÃO o Sistema imprime o calculo da taxa (variavel taxa),
        }
        //Fim do exercicio
    }
}
