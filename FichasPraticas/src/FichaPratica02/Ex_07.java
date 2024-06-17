package FichaPratica02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor: ");
        valor = input.nextInt();

        //Apresentar se é par ou ímpar
        //Um número é considerado par se for igualmente divisível por 2, ou seja, não deixa resto quando dividido por 2
        //SE o resto(%) do valor a dividir por 2 é igual a 0 então é par.

        if (valor%2==0){
            System.out.println("O número é par.");
        } else{
            System.out.print("O número é ímpar.");
        }
    }
}
