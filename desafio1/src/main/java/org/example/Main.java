package org.example;

import org.example.model.Animal;
import org.example.service.AnimalService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listaDeAnimais = new ArrayList<>();
        AnimalService animalService = new AnimalService();

        listaDeAnimais.add(new Animal("Gato", "mamifero", "carnivoro", 20, 4));
        listaDeAnimais.add(new Animal("cachorro", "mamifero", "carnivoro", 40, 2));
        listaDeAnimais.add(new Animal("rato", "mamifero", "onivoros", 2, 1));
        listaDeAnimais.add(new Animal("gaviao", "ave", "carnivoro", 13, 5));
        listaDeAnimais.add(new Animal("cachorro", "mamifero", "carnivoro", 40, 2));
        listaDeAnimais.add(new Animal("cachorro", "mamifero", "carnivoro", 40, 2));

        System.out.println(animalService.listaDeAnimalPorTipo(listaDeAnimais,"ave"));
    }
}