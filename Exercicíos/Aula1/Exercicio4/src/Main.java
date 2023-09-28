import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double salarioMinimo = 1320.0;

        Scanner salarioUsuario = new Scanner(System.in);
        System.out.println("Qual o seu Salario ?");
        double salario = salarioUsuario.nextDouble();

        double quantidadeDeSalarios = salario / salarioMinimo;


        System.out.printf("O usuario ganha %.2f salarios minimos.", quantidadeDeSalarios);

        salarioUsuario.close();
    }
}