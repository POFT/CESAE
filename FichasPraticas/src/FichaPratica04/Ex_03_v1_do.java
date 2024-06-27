package FichaPratica04;

import java.util.Scanner;

public class Ex_03_v1_do {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Ex_03

        int valorUser1, valorUser2, contador=0;

        //Crie um jogo, que peça ao jogador 1 um valor entre 0 e 100.
        // Ao colocar a questão fora do "do"/FAZER não existe repetição.
        System.out.println("Jogador 1 - Introduza um valor entre 1 e 100: ");
        valorUser1 = input.nextInt();

        do { //De seguida, deverá permitir ao jogador 2 tentar acertar no valor inserido pelo jogador 1.
            System.out.println("Jogador 2 - Adivinha qual é o valor correto entre 1 e 100: ");
            valorUser2 = input.nextInt();

            contador++; //Contador para "No final (quando o valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou para acertar."

            if (valorUser2 > valorUser1){ // A cada iteração, enquanto o valor não for descoberto, deverá informar se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido pelo jogador 1.
                System.out.print("O valor inserido é maior que o valor correto. ");
            }
            if (valorUser2 < valorUser1){
                System.out.print("O valor inserido é menor que o valor correto. ");
            }

        }while(valorUser2 != valorUser1);
        System.out.println("Acertou em " + contador + " tentativas.");

    }
}
