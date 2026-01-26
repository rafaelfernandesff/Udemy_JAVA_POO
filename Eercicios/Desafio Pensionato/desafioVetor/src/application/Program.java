package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Pensionato[] vect = new Pensionato[10];

        System.out.println("Quantos quartos serao alugados?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();

            vect[quarto] = new Pensionato(nome, email);
        }

        sc.close();

        System.out.println();
        System.out.println("Quartos ocupados: ");

        for (int i = 0; i < 10; i++) {
            if(vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
    }

}
