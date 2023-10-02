import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Em que ano você nasceu?");
        int nascimento = sc.nextInt();

        int ano = LocalDate.now().getYear();

        int idade = ano - nascimento;

        System.out.println("sua idade é " + idade + " anos");

        sc.close();
    }
}