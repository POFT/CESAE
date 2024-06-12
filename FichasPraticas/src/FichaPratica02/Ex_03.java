package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double salario, taxa;

        System.out.print("Introduza o seu salário anual: ");
        salario = input.nextDouble();

        // IF Salário até 15.000€ inclusive paga taxa de 20%
        // IF Salário de 15.000€ a 20.000€ inclusive paga taxa de 30%
        // IF Salário de 20.000€ a 25.000€ inclusive paga taxa de 35%
        // IF Salário superior a 25.000€ paga taxa de 40%


        if (salario <= 15000) {
            taxa = salario * 0.20;
            System.out.print("Paga taxa de 20%" + taxa + "€");
        }
        if (salario > 15000 && salario <= 20000) {
            taxa = salario * 0.30;
            System.out.print("Paga taxa de 30%" + taxa + "€");
        }
        if (salario > 20000 && salario <= 25000) {
            taxa = salario * 0.35;
            System.out.print("Paga taxa de 35%" + taxa + "€");
        }
        if (salario > 25000) {
            taxa = salario * 0.40;
            System.out.print("Paga taxa de 40%" + taxa + "€");
        }
    }
}
