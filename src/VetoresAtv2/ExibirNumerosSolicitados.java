package VetoresAtv2;

import java.util.Scanner;

public class ExibirNumerosSolicitados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetor = new int [5];
        int soma = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite o " + (i + 1)+ "º número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Exibindo números do vetor");
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        sc.close();

    }
}
