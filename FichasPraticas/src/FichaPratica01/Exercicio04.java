package FichaPratica01;

import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {

        // Import Scanner - uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double raio, area;

        // ler raio
        System.out.print("Introduza o raio: ");
        raio = input.nextDouble();

        // area da circunferencia é calculada através da multiplicação do PI por raio ao quadrado
        area = 3.14 * raio * raio;

        // Apresentar resultado area da circunferencia
        System.out.println("Area: " + area + "m2");


    }
}
