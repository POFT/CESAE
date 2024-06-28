package FichaPratica05;

import java.util.Scanner;

public class Ex_02_v2 {
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
            total = total + comissoes[i];

        }
        System.out.println("\n__________________________________\n"); // Linha apenas para separar
        System.out.println("Total anual: " + total);
    }
}
