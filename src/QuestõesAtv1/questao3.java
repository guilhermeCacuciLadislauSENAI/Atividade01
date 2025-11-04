import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // questão 3
        int numero1, numero2, soma;

        System.out.print("Escreva o  primeiro número: ");
        numero1 = sc.nextInt();
        System.out.print("Escreva o  segundo número: ");
        numero2 = sc.nextInt();
        soma = numero1 + numero2;
        System.out.print("O resultado é: " + soma);
        sc.close();
    }
}
