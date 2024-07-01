package FichaPratica05;

import java.util.Scanner;

public class Ex_11_v1 {
    public static void main(String[] args) {

        //Ex_11. Faça um programa que preencha cada posição de uma matriz (3x3 elementos inteiros) com um valor introduzido pelo utilizador.
        // Deverá indicar qual o maior e qual o menor dos valores guardados na matriz,
        // e deverá imprimirtodo o conteúdo da matriz de forma semelhante ao exercício 8.

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int[ ][ ] matriz = new int[3][3];
        int valorGuardado;



        //Ler os numeros inteiros para a tabela/matriz (input do user)
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){ //[0] serve para isolar uma linha para saber quantas colunas tem. (sem aplicabilidade nos exercicios)
                System.out.println("- Insira um nº inteiro["+ linha +"]["+ coluna +"]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }// bate aqui e só avança depois de linha for igual ou valor definido para a matriz.

        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        valorGuardado=matriz[0][0]; //faz sentido iniciar a variavel com qq valor inserido na matriz.

        //contador para guardar quantas vezes o "outroValor" existe na tabela/matriz
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){
                if (valorGuardado < matriz[linha][coluna]){// se o numero guardado...
                    valorGuardado = matriz[linha][coluna];
                }
            }
        }
        System.out.println("- Número maior = "+ valorGuardado);
        //Imprimir o maior o valor


        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){
                if (valorGuardado > matriz[linha][coluna]){
                    valorGuardado = matriz[linha][coluna];
                }
            }
        }
        System.out.println("- Número menor = "+ valorGuardado);
        //Imprimir o menor o valor

    }
}
