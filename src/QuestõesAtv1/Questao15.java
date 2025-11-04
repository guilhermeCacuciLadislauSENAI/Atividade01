package QuestõesAtv1;

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 10;
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        System.out.println("\n=== TABUADA ===");
        do{
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador --;
        }while(contador != 0);

    }
}
