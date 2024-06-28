package FichaPratica05;

import java.util.Scanner;

public class Ex_02_v1 {
    public static void main(String[] args) {

        // Ex_02. Implemente um programa que permita adicionar comissões mensais a um array de tamanho 12 (uma posição para cada mês) e calcular o seu total anual.


        Scanner input = new Scanner(System.in);

        //declarar variaveis
        String[] meses = new String[]{"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        double[] comissoes = new double[12];
        double total=0;

        //ler valor das comissões
        for (int i = 0; i < comissoes.length; i++) {
            System.out.println("Insira a comissão mensal [" + meses[i] + "]: "); // variavel declarada "String[] meses = new String[]..."
            comissoes[i] = input.nextDouble();

        }
        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        //Calcular o total(soma) e imprimir valor
        for (int i = 0; i < comissoes.length; i++) {
            total = total + comissoes[i];
            //1ª ciclo (total)0 = (total)0 + (vetor[0])10
            //2ª ciclo (total) 10 = (total)10 + (vetor[1])10
            //3ª ciclo (total) 20 = (total)20 + (vetor[2])5
        }
        System.out.println("Total anual: " + total);
    }
}
