import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner qualHora = new Scanner(System.in);

        System.out.println("Diga um horario.");
        int hora = qualHora.nextInt();

        System.out.println("Diga os minutos.");
        int minutos = qualHora.nextInt();

        System.out.println("Diga os segundos.");
        int segundos = qualHora.nextInt();

        int segundosPassadosDaMeiaNoite = hora * 3600 + minutos * 60 + segundos;

        int segundosParaMeiaNoite = 24 * 3600 - segundosPassadosDaMeiaNoite;

        System.out.println("Segundos pasados a meia noite " + segundosPassadosDaMeiaNoite);
        System.out.println("Segundos que faltam para a meia noite " + segundosParaMeiaNoite);

        qualHora.close();

    }
}