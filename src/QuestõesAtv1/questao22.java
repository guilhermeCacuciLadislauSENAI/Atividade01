package QuestõesAtv1;

import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long fatorial = 1;
        System.out.print("Digite um número para calcular fatorial: ");
        int numero = sc.nextInt();

        for(int i = numero; i > 0; i--){

            fatorial *= i;

        }

        System.out.print("Fatorial de " + numero + " é: " + fatorial);
        sc.close();
    }
}
