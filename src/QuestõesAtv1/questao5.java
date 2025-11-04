import java.util.Scanner;
public class questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, soma, subtracao, multiplicacao, divisao;
        char operacao;

        System.out.print("Digite o  primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o  segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = sc.next().charAt(0);

        if (operacao == '+') {
            soma = n1 + n2;
            System.out.print("O resultado da soma é: " + soma);
        } else if (operacao == '-') {
            subtracao = n1 - n2;
            System.out.print("O resultado da subtração é: " + subtracao);
        } else if (operacao == '*') {
            multiplicacao = n1 * n2;
            System.out.print("O resutado da multiplicação é: " + multiplicacao);
        } else if (operacao == '/'){
            divisao = n1 / n2;
            System.out.print("O resultado da divisão é: " + divisao);
        } else{
            System.out.print("Operação inválida.");
        }
        sc.close();

    }
}