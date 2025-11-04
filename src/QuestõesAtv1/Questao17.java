package QuestõesAtv1;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Contagens de notas devem ser inteiros (int)
        int nota100, nota50, nota20, nota10, nota5;
        double nota; // Valor lido

        System.out.print("Digite um valor em R$ (centavos serão ignorados): ");
        nota = sc.nextDouble();

        // Pega apenas a parte inteira do valor para calcular as notas
        int valor = (int) nota;

        System.out.println("Calculando notas para R$ " + valor + ",00...");

        // --- Lógica Correta ---

        // Calcula notas de 100
        nota100 = valor / 100; // Divisão inteira diz quantas notas cabem
        valor = valor % 100;   // Modulo (%) pega o que sobrou

        // Calcula notas de 50 (usando o valor que sobrou)
        nota50 = valor / 50;
        valor = valor % 50;

        // Calcula notas de 20
        nota20 = valor / 20;
        valor = valor % 20;

        // Calcula notas de 10
        nota10 = valor / 10;
        valor = valor % 10;

        // Calcula notas de 5
        nota5 = valor / 5;
        valor = valor % 5; // 'valor' agora contém o resto (0, 1, 2, 3 ou 4)

        // --- Exibe os resultados ---
        System.out.println("--- Distribuição de Notas ---");
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");

        // Mostra o que sobrou (que precisaria de notas de 2, 1 ou moedas)
        if (valor > 0) {
            System.out.println("Resto (necessita notas/moedas de R$ 2 ou R$ 1): R$ " + valor + ",00");
        }

        sc.close();
    }
}
