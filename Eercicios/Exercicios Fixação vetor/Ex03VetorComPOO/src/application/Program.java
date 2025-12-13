/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */

package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


import entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa [] vet = new Pessoa[n];
        List<String> nomeMenores;
        double somaAltura = 0.0;
        double mediaAltura = 0.0;
        double quantMenores = 0;

        for (int i = 0; i < vet.length; i++) {
            sc.nextLine();

            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vet[i] = new Pessoa(nome, idade, altura);
        }

        for (int i = 0; i < vet.length; i++) {
            somaAltura += vet[i].getAltura();
            if (vet[i].getIdade() < 16) {
                quantMenores ++;
            }
        }

        mediaAltura = somaAltura / vet.length;
        nomeMenores = new ArrayList<>();
        double porcentMenores = (quantMenores / vet.length) * 100;

        for (int i = 0; i < vet.length; i++){
            if (vet[i].getIdade() < 16) {
                nomeMenores.add(vet[i].getNome());
            }
        }

        System.out.println();
        System.out.printf("Altura media = %.2f\n",  mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f", porcentMenores);
        System.out.println("");
        for (int i = 0; i < nomeMenores.size(); i++) {
            System.out.println(nomeMenores.get(i));
        }

        sc.close();
    }
}
