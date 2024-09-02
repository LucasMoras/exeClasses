package com.mycompany.classes;

public class Carro {
    private String Marca;
    private String Modelo;
    private int Ano;
    private double Velocidade;

    public Carro(String Marca, String Modelo, int Ano, double Velocidade) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Velocidade = Velocidade;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public double getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(double Velocidade) {
        this.Velocidade = Velocidade;
    }
    
    public void Acelerar(double Valor){
        Velocidade += Valor;
        System.out.println("Aumento realizado");
    }
    public void Desacelerar(double Valor){
        Velocidade -= Valor;
        System.out.println("Reducao realizada");
    }
    public void Exibir(){
        System.out.println(Velocidade);
    }
    
}
