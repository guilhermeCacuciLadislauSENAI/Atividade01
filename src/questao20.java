import java.util.Scanner;
public class questao20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dolar = 5.38, euro = 6.22, conversao = 0, taxaFixa = 20.00;

        System.out.print("Digite um valor em R$");
        double quantia = sc.nextDouble();
        if(quantia <= taxaFixa){
            System.out.println("Valor inválido. A quantia deve ser maior que a taxa fixa.");
            sc.close();
            return;
        }

        double valorAConverter = quantia - taxaFixa;

        do {
            System.out.println("\nVocê deseja fazer a conersão para dólares ou euros?");
            System.out.print("Digite 1 para dólar e 2 para euro: ");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                conversao = valorAConverter / dolar;
                System.out.printf("Valor convertido: US$ %.2f\n", conversao);
                break;
            } else if (opcao == 2) {
                conversao = valorAConverter / euro;
                System.out.printf("Valor convertido: € %.2f\n", conversao);
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        } while (true);

        sc.close();
    }
}
