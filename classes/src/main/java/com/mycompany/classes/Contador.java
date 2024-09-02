package com.mycompany.classes;

public class Contador {

    private int Valor;

    public Contador(int Valor) {
        this.Valor = Valor;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public void Aumentar(int Saldo) {
        Valor += Saldo;
            System.out.println("Novo saldo: " + Valor);
    }
    public void Diminuir(int Saldo) {
        if(Saldo <= Valor){
            Valor -= Saldo;
                System.out.println("Novo Saldo: " + Valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
