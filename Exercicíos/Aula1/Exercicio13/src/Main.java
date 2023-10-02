import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga um fatorial que não seja negativo: ");
        int numero = sc.nextInt();

        int original = numero;
        int fator = 1;

        while (numero >1) {
            fator *= numero;
            numero--;
        }

        System.out.println("O valor do fatorial de " + original + "é igual a: " + fator);
    }
}