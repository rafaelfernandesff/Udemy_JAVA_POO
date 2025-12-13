/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.*/

import java.util.Locale;
import java.util.Scanner;

public class Ex06Vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai ter cada vetor? ");
        int n = sc.nextInt();
        int [] vetA = new int[n];
        int [] vetB = new int[n];
        int [] vetC = new int[n];

        System.out.println("Digite os valores do veto A:");
        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do veto B:");
        for (int i = 0; i < vetA.length; i++) {
            vetB[i] = sc.nextInt();
        }


        for (int i = 0; i < vetC.length; i++) {
            vetC[i] = vetA[i] + vetB[i];
        }

        System.out.println("Vetor resultante: ");

        for (int i = 0; i < vetC.length; i++) {
            System.out.println(vetC[i]);
        }

        sc.close();
    }
}
