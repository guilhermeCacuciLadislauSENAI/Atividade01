package QuestõesAtv1;

import java.util.Scanner;

public class Questao29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Crie sua senha seguindo as instruções:");
        System.out.println("1- No mínimo 6 caracteres");
        System.out.println("2- No mínimo um caracter maiúsculo (A-Z)");
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        boolean temComprimento = false;
        boolean temMaiuscula = false;

        if (senha.length() >= 6) {
            temComprimento = true;
        }

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
                break;
            }
        }

        if (temComprimento && temMaiuscula) {
            System.out.println("Senha válida e cadastrada com sucesso!");
        } else {
            System.out.println("\nSenha inválida! Verifique os requisitos:");
            if (!temComprimento) {
                System.out.println("- Sua senha deve ter no mínimo 6 caracteres.");
            }
            if (!temMaiuscula) {
                System.out.println("- Sua senha deve ter no mínimo um caractere maiúsculo.");
            }
        }

        sc.close();
    }
}