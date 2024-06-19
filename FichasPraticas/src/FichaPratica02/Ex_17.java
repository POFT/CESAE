package FichaPratica02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int saldo;


        //Ler saldo, "num montante variável com base no seu saldo médio do último ano."


        //Programa para ler o saldo médio de um cliente
        System.out.print("Introduza o saldo médio do ultimo ano:");
        saldo = input.nextInt();



        //calcular o valor do crédito especial de acordo com a seguinte tabela.
        //De 0 a 2000 (inclusive) = Nenhum crédito
        if (saldo <= 2000) {
            System.out.print("Nenhum crédito.");
        }
        //De 2000 a 4000 (inclusive) = 20% do valor do saldo médio e apresentar valor a crédito
        if (saldo > 2000 && saldo <= 4000) {
            System.out.print("20% do valor do saldo médio: " + saldo*0.20 + "€");
        }
        //De 4000 a 6000 (inclusive) = 30% do valor do saldo médio e apresentar valor a crédito
        if (saldo > 4000 && saldo <= 6000) {
            System.out.print("30% do valor do saldo médio: "  + saldo*0.30 + "€");
        }
        //Acima de 6000 = 40% do valor do saldo médio e apresentar valor a crédito
        if (saldo > 6000) {
            System.out.print("40% do valor do saldo médio: " + saldo*0.40 + "€");
        }


    }
}
