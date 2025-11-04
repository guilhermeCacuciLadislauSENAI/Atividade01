package QuestõesAtv1;

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if(numero > 0){
            System.out.print("O número " + numero + " é positivo!");
        }else if(numero < 0){
            System.out.print("O número " + numero + " é negativo!");
        }else{
            System.out.print("O número " + numero + " é zero!");
        }

    }
}
