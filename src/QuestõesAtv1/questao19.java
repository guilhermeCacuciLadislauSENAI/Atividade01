package QuestõesAtv1;

import java.util.Random;
import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        int numero, numeroSorteado;

        numeroSorteado = gerador.nextInt(100) + 1;

        boolean acertar = false;
        while(acertar != true){
            System.out.print("Digite um número para tentar advinhar: ");
            numero = sc.nextInt();

            if(numero == numeroSorteado){
                System.out.print("Parabéns, você acertou!");
                acertar = true;
            }else{
                System.out.println("Você errou, tente novamente!");
                if(numeroSorteado > numero){
                    System.out.println("O número sorteado é maior!");
                }else{
                    System.out.println("O número sorteado é menor!");
                }
            }

        }
        sc.close();
    }
}
