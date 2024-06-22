package FichaPratica01;

import java.util.Scanner;

public class Ex_09_v1 {
    public static void main(String[] args) {
        //Ex_09: Foi contactado pela empresa "XPTO,Lda." para a elaboração de um program que permita calcular o vencimento de um colaborador, bem como os decontos e impostos decorrentes desse processamento salarial.
            //Conceitos:
                // a. Vencimento base: 40€/ dia.
                // b. Subsídio de alimentação: 5€/dia
                // c. Retenção de IRS: 10%.
                // d. Segurança Social: 11% encargo do funcionário e 23,75% encargo da entidade patronal.
        // Deve ser solicitado ao utilizador o código do funcionário e o número de dias que ele trabalhou nesse mês.
            // Deverá depois apresentar:
                // a. o valor iliquído a receber fruto do vencimento.
                // b. total subsídio de alimentação.
                // c. valor da retenção de IRS a entregar ao estado.
                // d. valor total a entregar à Segurança Social (ambos os encargos).
                // e. valor líquido a receber pelo funcionário.

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        // Declarar variáveis
        double funcionarioID, dias, vencimentoBase, subAlimentacao, retIRS, vencLiquido, segSocial1, segSocial2, segSocialTotal;


        // Pedir ao user os valores e guardar input do user nas respetivas variaveis
        System.out.print("- Introduza código de funcionário: ");
        funcionarioID = input.nextDouble();
        System.out.print("- Introduza os nº de dias trabalhados: ");
        dias = input.nextDouble();
            //Através do user input sabemos os dias trabalhados pelo funcionário,

        //desta forma, já podemos calcular o Vencimento base: 40€/ dia.
        vencimentoBase = 40 * dias;



        //Calcular os encargos, Retenção IRS e Segurança Social
        retIRS = vencimentoBase * 0.10; // Retenção de IRS:10%
        segSocial1 = vencimentoBase * 0.11; // Segurança Social funcionário: 11%
        segSocial2 = vencimentoBase * 0.2375; // Segurança Social patrono: 23,75%
        segSocialTotal = segSocial1 + segSocial2;
        vencLiquido = vencimentoBase - retIRS - segSocialTotal;
        subAlimentacao = 5 * dias;

        // Apresentar o resultado das operações
        System.out.println("Vencimento base: " + vencimentoBase + "€");
        System.out.println("Retenção IRS: -" + retIRS + "€");
        System.out.println("Segurança Social: -" + segSocialTotal + "€" +"\n");
        System.out.println("Valor líquido: " + vencLiquido + "€");
        System.out.println("Subsídio de alimentação: " + subAlimentacao + "€");

        //Fim do exercicio.
    }
}
