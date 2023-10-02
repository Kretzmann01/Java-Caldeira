import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga uma temperatura em graus celsius");
        double celsios = sc.nextDouble();

        double fahrenheit = (celsios * 1.8) + 32;

        System.out.println("a temperatura em fahrenheit é " + fahrenheit);

        int fahrenheitInteira = (int) fahrenheit;

        System.out.println("A temperatura em fahrenheit inteira é " + fahrenheitInteira);

        sc.close();
    }
}