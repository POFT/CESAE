package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaPonderada;

        // Ler as três notas (0-20 valores) de um aluno,
        System.out.print("Introduza nota 1 (0-20): ");
        nota1 = input.nextDouble();
        System.out.print("Introduza nota 2 (0-20): ");
        nota2 = input.nextDouble();
        System.out.print("Introduza nota 3 (0-20): ");
        nota3 = input.nextDouble();

        // calcular a média final ponderada ( multiplicar valor introduzido pelo valor % e somar)
        // Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3:40%
        mediaPonderada = nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.40;
        System.out.println("Media ponderada: " + mediaPonderada + "%");
        
        // e diga se está aprovado ou não (mais de 9.5).
        if (mediaPonderada > 9.5) {
            System.out.print("Está aprovado.");
        }else{
            System.out.print("Reprovado.");
        }

    }
}
