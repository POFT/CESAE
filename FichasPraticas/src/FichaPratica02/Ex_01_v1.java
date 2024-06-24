package FichaPratica02;

import java.util.Scanner;

public class Ex_01_v1 {
    public static void main(String[] args) {

        //Ex_01: Leia dois números inteiros e escreva na consola o maior deles.


        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado
        int numero1, numero2;


        System.out.println("- Introduza um numero: "); //Pedir ao user o numero1
        numero1 = input.nextInt(); //Guardar input do user na variavel numero1
        System.out.println("- Introduza outro numero: "); //Pedir ao user o numero2
        numero2 = input.nextInt(); //Guardar input do user na variavel numero2


        if (numero1 > numero2) { // SE(if) o numero1 é maior(>) ao numero2,
            System.out.println("- Maior: "+ numero1); // ENTÃO o Sistema imprime o maior numero (variavel numero1),
        }else{ // SENÃO (else),
            System.out.println("- Maior: "+ numero2); // Sistema imprime o maior numero (variavel numero2),
        }
        //Fim do exercicio
    }
}
