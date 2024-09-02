package com.mycompany.classes;

public class Livro {

    private String Autor;
    private String Titulo;
    private int NumPaginas;
    private int NumExemplares;

    public Livro(String Autor, String Titulo, int NumPaginas, int NumExemplares) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.NumPaginas = NumPaginas;
        this.NumExemplares = NumExemplares;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

    public int getNumExemplares() {
        return NumExemplares;
    }

    public void setNumExemplares(int NumExemplares) {
        this.NumExemplares = NumExemplares;
    }

    public void Emprestar(int Valor) {
        if (NumExemplares >= Valor) {
                NumExemplares -= Valor;
                    System.out.print("Emprestimo realizado " + "Estoque retante: " + NumExemplares);
        } else {
            System.out.println("Estoque invalido");
        }
    }

    public void Devolver(int Valor) {
        NumExemplares += Valor;
            System.out.println("Livro devolvido " + "Estoque atual: " + NumExemplares);
    }
}
