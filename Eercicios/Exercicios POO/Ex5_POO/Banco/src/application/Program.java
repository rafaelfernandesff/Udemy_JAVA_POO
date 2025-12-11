package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Digite o numero da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Digite o nome do titular da conta: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        System.out.print("Quer fazer um deposito inicial (y/n)? ");
        char temDeposito = sc.next().charAt(0);
        
        if (temDeposito == 'y'){
            System.out.print("Entre com o valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numeroDaConta, nomeTitular, depositoInicial);
        }
        else{
            conta = new Conta(numeroDaConta, nomeTitular);
        }
        
        System.out.println();
        System.out.println("Dados da conta:");
        System.out.print(conta);

        System.out.println();
        System.out.print("Entre com o valor do deposito: ");
        conta.deposito(sc.nextDouble());

        System.out.println();
        System.out.println("Dados da conta atualizados:");
        System.out.print(conta);

        System.out.println();
        System.out.print("Entre com o valor do saque: ");
        conta.saque(sc.nextDouble());
        
        System.out.println();
        System.out.println("Dados da conta atualizados:");
        System.out.print(conta);
        System.out.println();

        sc.close();

    }

}
