import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga um valor em Dolar.");
        double dolar = sc.nextDouble();

        System.out.println("Qual a taxa do cambio atual ?");
        double cambio = sc.nextDouble();

        double conversao = dolar * cambio;

        System.out.println("O valor convertido é: " + conversao);

        sc.close();
    }
}