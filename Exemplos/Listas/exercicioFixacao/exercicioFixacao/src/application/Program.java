package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

import entities.Funcionario;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();
        Funcionario obj;

        System.out.print("Quantos funcionarios vao ser adicionados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i ++) {

            System.out.println("Funcionari #" + i + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            System.out.println();

            obj = new Funcionario(id, nome, salario);

            list.add(obj);
            
        }

        System.out.print("Digite o id do funcionario que vai receber um aumento de salario: ");
        int idAumento = sc.nextInt();
        System.out.print("Digite a porcentagem: ");
        double aumento = sc.nextDouble();

        sc.close();

        Funcionario fc = list.stream().filter(f -> f.getId() == idAumento).findFirst().orElse(null);

        if (fc != null) {
            fc.setSalario(fc.getSalario() * (1 + aumento / 100));
        }

        System.out.println();
        System.out.println("Lista de Funcionarios: ");
        for (Funcionario x : list) {
            System.out.printf("%d, %s, %.2f%n", x.getId(), x.getNome(), x.getSalario());

        }

    }

}
