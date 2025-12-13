/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */ 

import java.util.Scanner;

public class Ex01Vetor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tamVetor = sc.nextInt();
        int [] vet = new int[tamVetor];

        for(int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < 0){
                System.out.println(vet[i]);
            }
        }


        sc.close();
    }
}
