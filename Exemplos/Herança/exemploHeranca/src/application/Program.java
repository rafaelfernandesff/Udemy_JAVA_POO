package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.00);

        // UPCASTING ->

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "ana", 0.0, 0.01);


        // DOWNCASTING ->

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);
        


        // SUBRPOSICAO ->

        Account acc5 = new Account(1001, "Alex", 1000.0);
        acc5.withdraw(200.0);
        System.out.println(acc5.getBalance());
        /*Nesse caso daria 795.0,
         ja que o saque de contas do tipo account tem uma taxa de 5 reais*/

        
        Account acc6 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        //O objeto do tipo Account foi instanciado como um SavingsAccount
        //Isso se chama Upcasting 

        acc6.withdraw(200.0);
        // O metodo whithdraw foi sobrescrito na classe SavingsAccount

        System.out.println(acc6.getBalance());
        /*Ja nesse caso o saldo da conta sera 800.0, 
        ja que o metodo de saque para contas do tipo SavingsAccount não possui taxa*/

        

        Account acc7 = new BusinessAccount(1003, "Bob", 1000.0, 200.0);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());
        /*Resultado: 793.0, foi sobrescito reutilizando a lógica do 
        withdraw da superclasse utilizando a palavra super, e adicionou
        mais uma lógica em cima*/


    }
}
