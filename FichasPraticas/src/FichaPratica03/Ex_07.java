package FichaPratica03;

public class Ex_07 {
    public static void main(String[] args) {


        int count = 1, soma = 0;

        //ENQUANTO count (1) é inferior ou igual 100 o programa imprime os numeros inteiros de 1 a 100 inclusive.
        while (count <= 100){
            System.out.println(count);
            soma = soma + count; //"Calculo" Programa soma todos os valores impressos.
            count = count + 1; //ou count++
        }
        //Programa imprime o resultado do "calculo".
        System.out.println("Somatorio: " + soma);

    }
}
