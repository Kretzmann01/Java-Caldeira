import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                ***** Selecione o numero que se encaixa com você *****
                1 - Para gestantes.
                2 - Para idosos.
                3 - Para PCD's.
                4 - Para nenhuma das alternativas.
                """);


        int opcao = sc.nextInt();

        if (opcao != 4) {
            System.out.println("Você está na Fila prioritaria");
        } else {
            System.out.println("Você está na Fila normal");
        }

        sc.close();
    }
}