package FichaPratica02;

import java.util.Scanner;

public class Ex_02_repeat {
    public static void main(String[] args) {

        // Import Scanner - uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variáveis, double porque o valor não é inteiro
        double salario, taxa;

        //Ler salario
        System.out.print("Introduza um salário:");
        salario = input.nextDouble();

        // Determinar montante de impostos a pagar mediante valor introduzido (salario <= 15000 paga 20%)
        if (salario <= 15000) {
            taxa = salario * 0.20;
            System.out.print("Paga taxa de 20%:"+ taxa + "€");
        }else {
            taxa = salario * 0.30;
            System.out.print("Paga taxa de 30%:"+ taxa + "€");
        }


    }
}
