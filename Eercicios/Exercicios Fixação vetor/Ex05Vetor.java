/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).*/

import java.util.Locale;
import java.util.Scanner;

public class Ex05Vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double [] vet = new double[n];
        
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double maiorNum = vet[0];
        int indiceMaior = 0;

        for (int i = 1; i < vet.length - 1; i++) {
            if (vet[i] > vet[i+1]) {
                maiorNum = vet[i];
                indiceMaior = i;
            }
        }

        System.out.println("Maior valor = " + maiorNum);
        System.out.println("Posicao do maior = " + indiceMaior);

        sc.close();
    }

}
