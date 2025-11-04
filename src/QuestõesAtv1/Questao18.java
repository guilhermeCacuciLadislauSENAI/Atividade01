package QuestõesAtv1;

import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean ehPrimo = true;

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if(numero <= 1){
            System.out.print("Não é primo!");
        } else if(numero == 2){
            System.out.print("É primo!");
        } else if(numero % 2 == 0){
            System.out.print("Não é primo!");
        }else {
            int limite = (int) Math.sqrt(numero);

            for (int i = 3; i <= limite; i += 2) {

                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

        }

        if(ehPrimo){
            System.out.print("É primo!");
        } else{
            System.out.print("Não é primo!");
        }

        sc.close();
    }
}
