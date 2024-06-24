package FichaPratica02;

import java.util.Scanner;

public class Ex_06_v1 {
    public static void main(String[] args) {
        //Ex_06: Escreva um programa que leia dois valores numéricos e apresente o maior e depois o menor.


        Scanner input = new Scanner(System.in);  // Import Scanner - quando precisar de ler coisas do teclado

        //Declarar variáveis
        int valorNumerico1, valorNumerico2;

        // Solicitar valores ao utilizador
        System.out.print("Introduza um número: ");
        valorNumerico1 = input.nextInt(); //Guardar input do user na variavel valorNumerico1
        System.out.print("Introduza um número: ");
        valorNumerico2 = input.nextInt(); //Guardar input do user na variavel valorNumerico2

        //Este exercicio é igual ao anterior(Ex_05) apenas é alterada a condição (operador)
        if (valorNumerico1 < valorNumerico2) { // SE(if) o valorNumerico1 é menor (<) ao valorNumerico2,
            System.out.print("- " + valorNumerico2 + "\t" + valorNumerico1);
        }else{
            System.out.print("- " + valorNumerico1 + "\t" + valorNumerico2);
        }
        //Fim do exercicio
    }
}
