package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        //Ler um número inteiro e, de seguida, leia uma mensagem.
        Scanner input = new Scanner(System.in);

        //Declarar Variàveis
        int inicioNumero = 0, fimNumeroRepeticoes;
        String mensagem;

        //Solicitar um numero inteiro ao utilizador.
        System.out.print("Introduza um número: ");
        fimNumeroRepeticoes = input.nextInt();

        //Solicitar uma mensagem ao utilizador (Ex. "Adoro programação")
        System.out.print("Introduza uma mensagem: ");
        input.nextLine(); // Limpeza de buffer: sempre que é solicitado input anterior é necessário aplicar para aceitar o que vem depois do enter
        mensagem = input.nextLine();

        //Imprimir a mensagem ENQUANTO o x corresponde ao numero inteiro lido
        //É necessário sempre ter uma variavel para inicio e uma para fim,
        while (inicioNumero < fimNumeroRepeticoes){
            System.out.println(mensagem);
            inicioNumero = inicioNumero + 1;

        }


    }
}
