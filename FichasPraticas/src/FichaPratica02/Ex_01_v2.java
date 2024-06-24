package FichaPratica02;

import java.util.Scanner;

public class Ex_01_v2 {
    public static void main(String[] args) {
        //Ex_01: Leia dois números inteiros e escreva na consola o maior deles.


        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado
        int numero1, numero2;


        System.out.println("- Introduza um numero: "); //Pedir ao user o numero1
        numero1 = input.nextInt(); //Guardar input do user na variavel numero1
        System.out.println("- Introduza outro numero: "); //Pedir ao user o numero2
        numero2 = input.nextInt(); //Guardar input do user na variavel numero2


        // Pode existir mais do que uma solução,
        // neste exemplo alterei a condição de numero1 > numero2 para numero1 < numero2,
        // mas continuo a imprimir o numero maior.
        if (numero1 < numero2) { // SE(if) o numero1 é menor(<) ao numero2,
            System.out.println("- Maior: "+ numero2); // ENTÃO o Sistema imprime o maior numero (variavel numero2),
        }else{ // SENÃO (else),
            System.out.println("- Maior: "+ numero1); // Sistema imprime o maior numero (variavel numero1),
        }
        //Fim do exercicio
    }
}