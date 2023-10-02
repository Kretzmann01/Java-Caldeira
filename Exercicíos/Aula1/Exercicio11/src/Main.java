import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase.");
        String frase = sc.nextLine().toLowerCase();

        int vogais = 0;

        for (int i = 0; i < frase.length(); i++) {
            char vogal = frase.charAt(i);
            if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u') {
                vogais++;
            }
            
        }

        System.out.println("O total de vogais é: " + vogais);

        sc.close();
    }
}