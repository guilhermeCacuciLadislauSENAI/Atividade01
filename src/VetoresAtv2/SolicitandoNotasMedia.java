package VetoresAtv2;

import java.util.Scanner;

public class SolicitandoNotasMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notas[] = new double[5];
        double soma = 0, media;

        for(int i = 0; i < notas.length; i++){
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        media = soma / notas.length;
        System.out.print("A média das notas é: " + media);
        sc.close();
    }
}
