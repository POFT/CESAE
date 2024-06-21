package FichaPratica03;

import java.util.Scanner;

public class Ex_14_v1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int quantidade, count = 0, numAnterior, numAtual;
        boolean crescente = true;



        System.out.println("Quantos numeros pretende introduzir?");
        quantidade = input.nextInt();

        System.out.println("Insira um número: ");
        numAnterior = input.nextInt();



        while (count < quantidade){
            System.out.print("Insira um número: ");
            numAtual = input.nextInt();

            if (numAnterior >= numAtual){
                crescente = false;
            }
            numAnterior = numAtual;
            count = count + 1;
        }



        if (crescente){ //crescente == true
            System.out.print("Crescente.");
        }else{
            System.out.print("Não Crescente.");
        }
    }
}
