package FichaPratica05;

import java.util.Scanner;

public class Ex_07_v1 {
    public static void main(String[] args) {

        // Ex_07. Implemente um programa que armazene num array 10 valores pedidos ao utilizador, e retorne o maior valor par inserido.
        // Caso não exista, deverá informar o utilizador

        Scanner input = new Scanner(System.in);


        ///ESTA ERRADO





        // Declarar variaveis
        int[] vetor = new int[4];
        int valorGuardado = 0;
        boolean crescente=true;


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira um valor["+i+"]: ");
            vetor[i] = input.nextInt();
            //vetor [i]
                //vetor [0] = 10
                //vetor [1] = 9
                //vetor [2] = 8
                //vetor [3] = 7
                //vetor [4] = 6
                //vetor [5] = 5
                //vetor [6] = 4
                //vetor [7] = 3
                //vetor [8] = 2
                //vetor [9] = 1
        }
        System.out.println("\n__________________________________\n"); // Linha apenas para separar


        for (int i = 0; i < vetor.length; i++) { //PARA...
            if (vetor[i] % 2 == 0 && valorGuardado < vetor[i]){ //(SE) o resto(%) do vetor[i] a dividir por 2 é igual a 0 então é par (E/&&) valorGuardado < ao vetor[i]
                //vetor [i]
                    //SE vetor [0] = 10 o resto é 0 (10/2=5) && valorGuardado (variavel declarda a 0) < a vetor [0] = 10
                //vetor [1] = 9 o resto não é 0 (9/2=4.5), não passa na primeira validação, já n avança nem fica guardado,
                //vetor [2] = 8 o resto é 0 (8/2=4) && valorGuardado (10) < a vetor [2] = 8, não passa na segunda validação, já n avança nem fica guardado,
                //vetor [3] = 7 ...
                //vetor [4] = 6 ...
                //vetor [5] = 5 ...
                //vetor [6] = 4 ...
                //vetor [7] = 3 ...
                //vetor [8] = 2 ...
                //vetor [9] = 1 ...
                valorGuardado = vetor[i]; //"valorGuardado
            }
        }
       if (valorGuardado == 0){
           System.out.println("Não foi encontrado nenhum numero par.");
       }else {
           System.out.println("O par maior é: " + valorGuardado);
       }
    }
}
