package entities;

public class Conta {

    private int numeroDaConta;
    private String nomeTitular;
    private double saldoDaConta;

 
    public Conta(int numeroDaConta, String nomeTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);;
    }

    public Conta(int numeroDaConta, String nomeTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void deposito(double deposito) {
        saldoDaConta += deposito;
    }

    public void saque(double valorSaque) {
        saldoDaConta -= valorSaque + 5;
    }
    
    public String toString(){
        return "Conta " + getNumeroDaConta() + ", Titular: " 
        +  getNomeTitular() + ", Saldo: R$ "
        +  String.format("%.2f", saldoDaConta);
    }
}
