package com.github.pedrobacchini.domain;

public class Revista {

    private int numero;
    private String titulo;

    public Revista() { }

    public Revista(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public int getNumero() { return numero; }

    public void setNumero(int numero) { this.numero = numero; }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    @Override
    public String toString() {
        return "Revista{" +
                "numero=" + numero +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
