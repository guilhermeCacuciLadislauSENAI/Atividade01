package VetoresAtv2;

import java.util.Scanner;

public class VetorCompletoAPartirDeDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int [5];
        int[] vetor2 = new int [5];
        int[] vetor3 = new int [10];

        System.out.println("Vetor 1:");
        for(int i = 0; i < vetor1.length; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Vetor 2:");
        for(int j = 0; j < vetor2.length; j++){
            System.out.print("Digite o " + (j+1) + "º número: ");
            vetor2[j] = sc.nextInt();
        }

        for(int k = 0; k < vetor1.length; k++){
            vetor3[k] = vetor1[k];
        }

        for(int l = 0; l < vetor2.length; l++){
            vetor3[l + 5] = vetor2[l];
        }

        System.out.println("Vetor 3 com a junção do primeiro e do segundo vetor");
        for(int m = 0; m < vetor3.length; m++){
            System.out.println(vetor3[m]);
        }

        sc.close();

    }
}
