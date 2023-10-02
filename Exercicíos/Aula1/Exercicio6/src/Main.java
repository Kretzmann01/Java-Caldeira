import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Você não tem idade para votar.");
        } else if (idade == 16 || idade == 17 || idade > 65) {
            System.out.println("Seu voto é facultativo");
        } else {
            System.out.println("Você é obrigado a votar.");
        }

        sc.close();
    }
}