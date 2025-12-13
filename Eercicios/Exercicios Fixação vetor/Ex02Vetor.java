/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor */

import java.util.Locale;
import java.util.Scanner;

public class Ex02Vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] vet = new double[n];
        double soma = 0.0;
        double media;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        media = soma / vet.length;

        System.out.print("\nValores = ");
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("%.1f ", vet[i]);
        }

        System.out.println();
        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}
