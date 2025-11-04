package VetoresAtv2;

import java.util.Scanner;

public class SomandoNumerosSolicitados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetor = new int [5];
        int soma = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite o " + (i + 1)+ "º número: ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }

        System.out.print("A soma dos números são: " + soma);
        sc.close();
    }
}
