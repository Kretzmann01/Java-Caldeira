import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String nome = leitura.nextLine();
        System.out.println("Seu nome é " + nome);

        leitura.close();
    }
}