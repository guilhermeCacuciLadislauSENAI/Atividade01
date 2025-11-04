package QuestõesAtv1;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();

        System.out.println("=== TABUADA DO " + numero + " ===");
        for(int i = 0; i < 10; i++){
            System.out.println(numero + " x " + (i + 1) + " = " + (numero * (i + 1)));
        }
        sc.close();
    }
}
