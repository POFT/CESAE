package FichaPratica03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int inicio = 2, numUser;

        //Solicitar ao user um número
        System.out.print("Insira um numero: ");
        numUser = input.nextInt();

        //Este programa imprime numeros pares entre o 2 "inicio" até o numero introduzido pelo user inclusive.
        //Condição SE o resto(%) do valor a dividir por 2 é igual a 0 então é par.
        while (inicio <= numUser){
            if (numUser % 2 == 0){
                System.out.println("Numeros pares: " + inicio);
                inicio = inicio + 2;
            }else{
                numUser = numUser - 1;
                System.out.println(" Numeros pares: " + inicio);
                inicio = inicio + 2;
            }
        }
    }
}
