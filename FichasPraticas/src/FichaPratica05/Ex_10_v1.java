package FichaPratica05;

import java.util.Scanner;

public class Ex_10_v1 {
    public static void main(String[] args) {
        //Ex_10. Faça um programa que preencha cada posição de uma matriz 3x5 com valores inteiros introduzidos pelo utilizador.
        // Deverá depois ler um outro valor do utilizador e indicar quantos vezes existe na matriz

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int[ ][ ] matriz = new int[3][5];
        int outroValor;
        int contador=0;


        //Ler os numeros inteiros para a tabela/matriz (input do user)
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){ //[0] serve para isolar uma linha para saber quantas colunas tem. (sem aplicabilidade nos exercicios)
                System.out.println("- Insira um nº inteiro["+ linha +"]["+ coluna +"]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }// bate aqui e só avança depois de linha for igual ou valor definido para a matriz.

        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        System.out.println("(tabela/matriz)");
        System.out.print(" ");

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println(); //Aplica um Enter
        }

        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        //Ler o outroValor (input do user)
        System.out.println("- Insira um valor: ");
        outroValor = input.nextInt();

        //contador para guardar quantas vezes o "outroValor" existe na tabela/matriz
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){
                if (matriz[linha][coluna] == outroValor){ //Se na minha matriz na posição atual o valor é IGUAL ao outroValor...
                    contador++; //... vai contar.
                }
            }
        }

        System.out.println("\n__________________________________\n"); // Linha apenas para separar
        System.out.println("- Contador da tabela/matriz: " + contador); // Imprimir resultado do contador.
    }
}