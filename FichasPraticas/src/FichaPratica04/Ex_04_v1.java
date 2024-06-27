package FichaPratica04;

import java.util.Scanner;

public class Ex_04_v1 {
    public static void main(String[] args) {

        //Ex_04 Escreva um programa que indique se um número pedido ao utilizador é primo.
        // (Chamamos de número primo um número natural que só possui dois divisores: 1 e ele mesmo).
        // (Por exemplo: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, etc…)
            //O número é chamado de primo quando ele é maior do que 1 e possui exatamente dois divisores: 1 e ele mesmo.

        Scanner input = new Scanner(System.in);

        int numUser;


        do {
            System.out.println("Introduza um numero: ");
            numUser = input.nextInt();
            if (numUser <= 0) { //Se o número for menor a 1, ele não é primo
                System.out.println(numUser + " não é um número primo.");
            }
            if (numUser % 2 == 0) { //SE o resto do numero a dividir por 2 == 0.
                System.out.println(numUser + " é um número primo.");
            }else{
                System.out.println(numUser + " não é um número primo.");
            }
        }while (numUser % numUser == 1);
    }
}
