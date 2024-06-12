package FichaPratica01;

import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {

        // Import Scanner - uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, num3, mediaAritemetica, mediaponderada;

        // ler 1º input/valor do utilizador
        System.out.print("Insira o 1º valor: ");
        num1 = input.nextDouble();

        // ler 2º input/valor do utilizador
        System.out.print("Insira o 2º valor: ");
        num2 = input.nextDouble();

        // ler 3º input/valor do utilizador
        System.out.print("Insira o 3º valor: ");
        num3 = input.nextDouble();

        // calcular media Aritemetica, soma dos valores a dividir total dos elementos
        mediaAritemetica = (num1 + num2 + num3) / 3;

        // Apresentar resultado media Aritemetica
        System.out.println("Media Aritemetica: " + mediaAritemetica + "%");

        // calcular media ponderada, multiplcar pelo valor
        mediaponderada =  num1 * 0.20 + num2 * 0.30 + num3 * 0.50;

        // Apresentar resultado media ponderada
        System.out.println("Media Ponderada: " + mediaponderada + "%");

    }
}
