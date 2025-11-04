package VetoresAtv2;

import java.util.Scanner;

public class NumerosPositivosApenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetor = new int [10];
        int n = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = sc.nextInt();
        }

        for (int j = 0; j < vetor.length; j++){
            if(vetor[j] >= 0){
                System.out.println(vetor[j]);
            }
        }

    }
}
