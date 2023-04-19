package org.example.model;

import java.util.Objects;

public class Animal {
    private String nome;
    private String tipo;
    private String alimentacao;
    private double peso;
    private int idade;

    public Animal(String nome, String tipo, String alimentacao, double peso, int idade) {
        this.nome = nome;
        this.tipo = tipo;
        this.alimentacao = alimentacao;
        this.peso = peso;
        this.idade = idade;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return peso == animal.peso && idade == animal.idade && Objects.equals(nome, animal.nome) && Objects.equals(tipo, animal.tipo) && Objects.equals(alimentacao, animal.alimentacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, tipo, alimentacao, peso, idade);
    }
}
