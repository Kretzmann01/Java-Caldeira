import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua idade ? ");
        int idade = sc.nextInt();

        System.out.println("Qual o seu salário ? ");
        double salario = sc.nextDouble();

        if (idade >= 18 && salario >= 2000.0) {
            System.out.println("Você foi aprovado para o financiamento e poderá adquirir um automóvel.");
        } else {
            System.out.println("Você não foi aprovado para o financiamento.");
        }

        sc.close();
    }
}