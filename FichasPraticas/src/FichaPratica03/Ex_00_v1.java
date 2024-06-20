package FichaPratica03;

import java.util.Scanner;

public class Ex_00_v1 {
    public static void main(String[] args) {

        //Este programa escreve na consola uma nota lida do user.
        //O programa pergunta a nota até que seja  inserida uma nota de 0 a 20.
        Scanner input = new Scanner(System.in);

        int nota = -1;

        //Condição while/enquanto
        while (nota < 0 || nota > 20) {
            System.out.println("Insira uma nota:");
        }
        System.out.println("Nota: " + nota);

    }
}
