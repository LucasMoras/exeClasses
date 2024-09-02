package com.mycompany.classes;

public class Retangulo {

    private double Largura;
    private double Altura;

    public Retangulo(double Largura, double Altura) {
        this.Largura = Largura;
        this.Altura = Altura;

    }

    public double getLargura() {
        return Largura;
    }

    public void setLargura(double Largura) {
        this.Largura = Largura;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public void CalcularArea() {
        double Area = Altura * Largura;
        System.out.println("Area de: " + Area);
    }
}
