package FichaPratica04;

import java.util.Scanner;

public class Ex_03_v1_for_feio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Ex_03

        int valorJogo, valorUser2, contador=0;

        //Crie um jogo, que peça ao jogador 1 um valor entre 0 e 100.
        // Ao colocar a questão fora do "do"/FAZER não existe repetição.
        System.out.println("Introduza um valor entre 0 e 100: ");
        valorJogo = input.nextInt();


        for (;;) { //De seguida, deverá permitir ao jogador 2 tentar acertar no valor inserido pelo jogador 1.
            System.out.println("Adivinha qual é o valor correto entre 1 e 100: ");
            valorUser2 = input.nextInt();
            contador++; //Contador para "No final (quando o valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou para acertar."
            if (valorUser2 > valorJogo){ // A cada iteração, enquanto o valor não for descoberto, deverá informar se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido pelo jogador 1.
                System.out.print("O valor inserido é maior que o valor correto. ");
            } else if (valorUser2 < valorJogo){
                System.out.print("O valor inserido é menor que o valor correto. ");
            } else {
                System.out.println("Acertou em " + contador + " tentativas.");
                break;
            }
        }
    }
}
