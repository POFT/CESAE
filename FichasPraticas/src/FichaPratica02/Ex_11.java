package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldo, movimento, saldoAposMovimento;

        System.out.print("Insira o saldo: ");
        saldo = input.nextDouble();

        System.out.print("Valor a movimentar: ");
        movimento = input.nextDouble();

        saldoAposMovimento = saldo + movimento;

        if (saldoAposMovimento >=0){
            saldo = saldoAposMovimento;
            System.out.println("Saldo atual: "+ saldo);

        }else {
            System.out.print("Operação inválida! Saldo insuficiente.");
        }


    }
}
