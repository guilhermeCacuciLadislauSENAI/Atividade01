import java.util.Scanner;

public class questao25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para N: ");
        int numero = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            if(i % 2 == 0){
                soma += i;
            }
        }

        System.out.print("A soma dos pares de 1 até " + numero + " é: " + soma);

        sc.close();
    }
}