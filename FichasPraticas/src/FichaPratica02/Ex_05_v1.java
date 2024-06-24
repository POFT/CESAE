package FichaPratica02;

import java.util.Scanner;

public class Ex_05_v1 {
    public static void main(String[] args) {
        //Ex_05: Escreva um programa que leia dois valores numéricos e apresente o menor e depois o maior.

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        int valorNumerico1, valorNumerico2;

        System.out.println("- Introduza um numero: "); //Pedir ao user um valor
        valorNumerico1 = input.nextInt(); //Guardar input do user na variavel valorNumerico1
        System.out.println("- Introduza outro numero: "); //Pedir ao user um valor
        valorNumerico2 = input.nextInt(); //Guardar input do user na variavel valorNumerico2


        if (valorNumerico1 > valorNumerico2) { // SE(if) o valorNumerico1 é maior (>) ao valorNumerico2,
            System.out.print("- " + valorNumerico2 + "\t" + valorNumerico1); // ENTÃO o Sistema imprime o valorNumerico2 e a seguir o valorNumerico1 (separado por uma horizontal tab "\t")
        }else{
            System.out.print("- " + valorNumerico1 + "\t" + valorNumerico2); // ENTÃO o Sistema imprime o valorNumerico1 e a seguir o valorNumerico2 (separado por uma horizontal tab "\t")
        }
        //Fim do exercicio
    }
}
