package exemplos_sala;

public class FormatacaoStrings {
    public static void main (String [] args){
        System.out.println("\n=== STRINGS ===");
        String frase = "Java é incrível!";
        System.out.println("Frase original: " + frase);
        System.out.println("Tamanho: " + frase.length());
        System.out.println("Maiúsculas: " + frase.toUpperCase());
        System.out.println("Minúsculas: " + frase.toLowerCase());
        System.out.println("Contém 'Java'? " + frase.contains("Java"));
        System.out.println("Substring (0, 6): " + frase.substring(0, 6));
        System.out.println("\n=== FIM DO PROGRAMA ===");
    }
}
