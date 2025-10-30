package exemplos_sala;
import java.util.Scanner;

public class EstruturaRepeticao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== ESTRUTURA DE REPETIÇÃO === ");
        // estrutura for, começando do 1 e indo até o 5
        System.out.println("FOR - Contando de 1 a 5: ");
        for(int i = 0; i <= 5; i++){
            System.out.println("Número: " + i);
        }

        // estrutura while realizando contagem regressiva em ordem decrescente
        System.out.println("\nWHILE - Contagem regressiva: ");
        int contador = 5;
        while(contador > 0){
            System.out.println("Contando: " + contador);
            contador--;
        }

        // estrutura do while com entrada de dados, enquanto número for maior do que zero continuará executando
        System.out.println("\nDO WHILE - Executa pelo menos uma vez: ");
        int numero;
        do{
            System.out.println("Digite um número maior que zero: ");
            numero = sc.nextInt();
        }while (numero > 0);
        if(numero > 0) {
            System.out.println("Número válido: " + numero);
        } else System.out.println("Número inválido: " + numero);

        System.out.println("\n=== FIM DO PROGRAMA ===");
    }
}
