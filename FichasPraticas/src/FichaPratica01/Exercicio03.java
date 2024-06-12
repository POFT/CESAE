package FichaPratica01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        // Import Scanner - uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int comprimento, largura, area, perimetro;

        // ler comprimento
        System.out.print("Introduza o comprimento: ");
        comprimento = input.nextInt();

        // ler largura
        System.out.print("Introduza o largura: ");
        largura = input.nextInt();

        // area é calculada através da Multiplicação do comprimento por a largura
        area = comprimento * largura;

        // Apresentar e resultado area
        System.out.println("Area: " + area);

        // Perimetro é calculado através da soma de todos os lados
        perimetro = (comprimento + largura) * 2;

        // Apresentar e resultado perimetro
        System.out.println("Perimetro: " + perimetro);


    }
}
