/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. */

import java.util.Locale;
import java.util.Scanner;

public class Ex04Vetor {
    public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
    
     System.out.print("Quantos numeroes voce vai digitar? ");
     int n = sc.nextInt();
     int [] vet = new int[n];
     int [] vetPares = new int[vet.length];
     int quantPares = 0;
    
     for (int i = 0; i < vet.length; i++) {
        System.out.print("Digite um numero:  ");
        vet[i] = sc.nextInt();
     }

     for (int i = 0; i < vet.length; i++) {
        if (vet[i] % 2 == 0) {
            vetPares[quantPares] = vet[i];
            quantPares ++;
        }
     }

     System.out.println("NUMEROS PARES: ");
     for(int i = 0; i < quantPares; i++) {
        System.out.print(vetPares[i] + " ");
     }

     System.out.println();
     System.out.println("QUANTIDADE DE PARES = " + quantPares);

     sc.close();
    }
}
