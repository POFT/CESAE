package FichaPratica02;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();
        System.out.print("Introduza um numero: ");
        num2 = input.nextInt();
        System.out.print("Introduza um numero: ");
        num3 = input.nextInt();

        //mostrar o menor de três números inteiros lidos.
        // SE num 1 é menor ao num2 E num3 é o MENOR,
        if (num1 < num2 && num1 < num3) {
            System.out.println("Menor:" + num1);
                }
        // SE num 2 é menor ao num1 E num3 é o MENOR,
        if (num2 < num1 && num2 < num3) {
            System.out.println("Menor:" + num2);
        }

        // SE num 2 é menor ao num1 E num3 é o MENOR,
        if (num3 < num1 && num3 < num2) {
                System.out.println("Menor:" + num3);
        }else{
            System.out.println("Os números introduzidos têm o mesmo valor.");
        }
    }
}
