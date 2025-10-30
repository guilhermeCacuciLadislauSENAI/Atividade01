import java.util.Scanner;
public class questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, n;

        System.out.print("Digite um número para somar de 1 até N: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            soma += i;
        }

        System.out.print("A soma dos valores de 1 até " + n + " é: " + soma);
        sc.close();

    }
}
