package FichaPratica02;

import java.util.Scanner;

public class Ex_07_v1 {
    public static void main(String[] args) {
        //Ex_07: Escreva um programa que leia um número, depois apresente se é par ou ímpar.

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        int valor;

        System.out.println("- Introduza um valor: "); //Pedir ao user o valor
        valor = input.nextInt(); //Guardar input do user na variavel valor


        //Um número é considerado par se for igualmente divisível por 2, ou seja, não deixa resto quando dividido por 2.
        if (valor%2==0){ //SE o resto(%) do valor a dividir por 2 é igual a 0 ENTÃO é par.
            System.out.print("O número é par.");
        } else{ //SENÃO o numero é impar
            System.out.print("O número é ímpar.");
        }
        //Fim do exercicio
    }
}
