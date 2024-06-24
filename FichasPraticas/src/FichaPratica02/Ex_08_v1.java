package FichaPratica02;

import java.util.Scanner;

public class Ex_08_v1 {
    public static void main(String[] args) {
        //Ex_08: Escreva um programa que leia três notas (0-20 valores) de um aluno,
            // calcule a sua média final ponderada, e diga se está aprovado ou não (mais de 9.5).
            // Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3:40%

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        double nota1, nota2, nota3, mediaPonderada;

        // Ler as três notas (0-20 valores) de um aluno,
        System.out.println("- Introduza nota 1 (0-20): ");
        nota1 = input.nextDouble();
        System.out.println("- Introduza nota 2 (0-20): ");
        nota2 = input.nextDouble();
        System.out.println("- Introduza nota 3 (0-20): ");
        nota3 = input.nextDouble();



        if (nota1 < 0 || nota1 > 20 || nota2 < 0 || nota2 > 20 || nota3 < 0 || nota3 > 20){
            System.out.println("ERRO no valor introduzido.");
        }else{
            mediaPonderada = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.4); // Calculo da mediaPonderada (Multiplicar valor introduzido pelo valor %ponderado e somar) Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3:40%
            System.out.println("Media ponderada: " + mediaPonderada + "%");

            if (mediaPonderada >= 9.5){
                System.out.print("Aprovado.");
            }else{
                System.out.print("Reprovado.");
            }
        }
        //Fim do exercicio
    }
}
