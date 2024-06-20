package FichaPratica02;

import java.util.Scanner;

public class Ex_18_v1 {
    public static void main(String[] args) {

        // Import Scanner - uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double ID, dias, vencimento = 0, subAlimentacao = 0, retencaoIRS, vencliquido, SegSocialFuncionario, SegSocialPatrono;

        String funcao;


        // Solicitar ID do Funcionario
        System.out.println("Introduza código de funcionário: ");
        ID = input.nextDouble();

        // NEW Solicitar função
        System.out.println("Introduzir função: (E)-Empregado, (C)-Chefe, (A)-Administrador ");
        funcao = input.next();

        // Solicitar dias trabalhados
        System.out.println("Introduza os nº de dias trabalhados: ");
        dias = input.nextDouble();

        switch (funcao) {
            case "E":
                vencimento = 40 * dias;
                subAlimentacao = 5 * dias;
                System.out.println("Vencimento base: " + vencimento + "€");
                System.out.println("Subsídio de alimentação: " + subAlimentacao + "€");
                break;
            case "C":
                vencimento = 60 * dias;
                subAlimentacao = 7.5 * dias;
                System.out.println("Vencimento base: " + vencimento + "€");
                System.out.println("Subsídio de alimentação: " + subAlimentacao + "€");
                break;
            case "A":
                vencimento = 80 * dias;
                subAlimentacao = 7.5 * dias;
                System.out.println("Vencimento base: " + vencimento + "€");
                System.out.println("Subsídio de alimentação: " + subAlimentacao + "€");
                break;
            default:
                System.out.println("Função não reconhecida.");
        }

        if (vencimento + subAlimentacao <= 1000) {
            retencaoIRS = (vencimento + subAlimentacao) * 0.1;
            System.out.println("Retenção de IRS: "+ retencaoIRS + "€");
        } else {
            retencaoIRS = (vencimento + subAlimentacao) * 0.2;
            System.out.println("Retenção de IRS: "+ retencaoIRS + "€");
        }
        if (funcao.equals("A")) {
            SegSocialFuncionario = (vencimento + subAlimentacao) * 0.09;
            SegSocialPatrono = (vencimento + subAlimentacao) * 0.21;
        } else {
            SegSocialFuncionario = (vencimento + subAlimentacao) * 0.11;
            SegSocialPatrono = (vencimento + subAlimentacao) * 0.2375;
        }
        vencliquido = (vencimento + subAlimentacao) - retencaoIRS - SegSocialFuncionario;
        System.out.println("Segurança Social: " + (SegSocialFuncionario + SegSocialPatrono));
        System.out.println("Valor líquido a receber: " + vencliquido);



    }
}
