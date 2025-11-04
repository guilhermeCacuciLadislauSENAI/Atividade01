import java.util.Scanner;

public class questao23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos termos da sequência Fibonacci você deseja ver: ");
        int numero = sc.nextInt();

        long[] vetor = new long[numero];

        if (numero > 0) {
            vetor[0] = 0;
        }
        if (numero > 1) {
            vetor[1] = 1;
        }

        for (int i = 2; i < numero; i++) {
            vetor[i] = vetor[i - 1] + vetor[i - 2];
        }

        System.out.println("Os " + numero + " primeiros termos da sequência Fibonacci são:");
        for (int i = 0; i < numero; i++) {
            System.out.print(vetor[i] + " ");
        }

        sc.close();
    }
}