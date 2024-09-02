package com.mycompany.classes;

public class ContaBancaria {

    private String titular;
    private double Saldo;
    private int NumeroConta;

    public ContaBancaria(String titular, double Saldo, int NumeroConta) {
        this.titular = titular;
        this.Saldo = Saldo;
        this.NumeroConta = NumeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int NumeroConta) {
        this.NumeroConta = NumeroConta;
    }
   public void Sacar(double valor) {
        if (valor > 0 && valor <= Saldo) {
            Saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
     public void Depositar(double valor) {
        if (valor > 0) {
           Saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor de deposito inválido.");
        }
    }
    public void ExibirSaldo(){
        System.out.println("Saldo: " + getSaldo());
    }
}
