import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double primeiroNumero;
        double segundoNumero;

        Scanner numeros = new Scanner(System.in);

        System.out.println("Diga o seu primeiro numero.");
        primeiroNumero = numeros.nextDouble();

        System.out.println("Diga o seu segundo numero. ");

        segundoNumero = numeros.nextDouble();

        System.out.println("O primeiro número é: " + primeiroNumero);
        System.out.println("O segundo número é: " + segundoNumero);

        numeros.close();
    }
}