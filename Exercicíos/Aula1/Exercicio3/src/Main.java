import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double primeiroNumero;
        double segundoNumero;
        double terceiroNumero;
        double max;
        double min;
        double media;

        Scanner numeros = new Scanner(System.in);

        System.out.println("Qual o primeiro número?");
        primeiroNumero = numeros.nextDouble();

        System.out.println("Qual o segundo número?");
        segundoNumero = numeros.nextDouble();

        System.out.println("Qual o terceiro número?");
        terceiroNumero = numeros.nextDouble();

        if (primeiroNumero > segundoNumero) {
            max = primeiroNumero;
        } else if (primeiroNumero > terceiroNumero) {
            max = primeiroNumero;
        } else if (segundoNumero > primeiroNumero) {
            max = segundoNumero;
        } else {
            max = terceiroNumero;
        }

        if (primeiroNumero < segundoNumero) {
            min = primeiroNumero;
        } else if (primeiroNumero < terceiroNumero) {
            min = primeiroNumero;
        } else if (segundoNumero < primeiroNumero) {
            min = segundoNumero;
        } else {
            min = terceiroNumero;
        }

        media = (primeiroNumero + segundoNumero + terceiroNumero) /3;

        System.out.println("O número de maior valor é: " + max);
        System.out.println("O número de menor valor é: " + min);
        System.out.println("A média aritimética é: " + media);
    }
}