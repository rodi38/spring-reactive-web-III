package org.example.service;

import org.example.model.Animal;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AnimalServiceTest {

    @Test
    public void testListaDeAnimaisPorAlimentacao() {
        //Criação dos animais para teste
        Animal animal1 = new Animal("Gato", "mamifero", "Carnívoro", 4.5, 3);
        Animal animal2 = new Animal("Cachorro", "mamifero", "Onívoro", 10.0, 4);
        Animal animal3 = new Animal("Papagaio", "ave", "Frugívoro", 0.3, 2);

        //Criação da lista de animais para teste
        List<Animal> animais = new ArrayList<>();
        animais.add(animal1);
        animais.add(animal2);
        animais.add(animal3);

        //Chamada do método a ser testado
        AnimalService service = new AnimalService();
        List<Animal> listaDeCarnivoros = service.listaDeAnimaisPorAlimentacao(animais, "Carnívoro");
        //Verificação do resultado
        assertEquals(1, listaDeCarnivoros.size());
        assertEquals("Gato", listaDeCarnivoros.get(0).getNome());
    }

    @Test
    public void testListaDeAnimalPorTipo() {
        //Criação dos animais para teste
        Animal animal1 = new Animal("Gato", "mamifero", "Carnívoro", 4.5, 3);
        Animal animal2 = new Animal("Cachorro", "mamifero", "Onívoro", 10.0, 6);
        Animal animal3 = new Animal("Papagaio", "ave","Frugívoro", 0.3, 2);
        List<Animal> animais = new ArrayList<>();
        animais.add(animal1);
        animais.add(animal2);
        animais.add(animal3);
        AnimalService service = new AnimalService();
        List<Animal> listaDeGatos = service.listaDeAnimalPorTipo(animais, "mamifero");
        assertEquals(2, listaDeGatos.size());
        assertEquals("Gato", listaDeGatos.get(0).getNome());
    }

    @Test
    public void testListaDeAnimaisDoTipoNComPesoMaiorQue() {
        Animal animal1 = new Animal("Gato", "mamifero", "Carnívoro", 4.5, 3);
        Animal animal2 = new Animal("Cachorro", "mamifero", "Onívoro", 10.0, 6);
        Animal animal3 = new Animal("Papagaio", "ave","Frugívoro", 0.3, 2);

        List<Animal> animais = new ArrayList<>();
        animais.add(animal1);
        animais.add(animal2);
        animais.add(animal3);

        AnimalService service = new AnimalService();
        List<Animal> listaDeMamiferosComPesoMaiorQue5 = service.listaDeAnimaisDoTipoNComPesoMaiorQue(animais, 5, "mamifero");
        assertEquals(1, listaDeMamiferosComPesoMaiorQue5.size());
    }

    @Test
    public void testListaDeAnimaisDoTipoNComPesoMenorQue() {
        //Criação dos animais para teste
        Animal animal1 = new Animal("Gato", "mamifero", "Carnívoro", 4.5, 3);
        Animal animal2 = new Animal("Cachorro", "mamifero", "Onívoro", 10.0, 6);
        Animal animal3 = new Animal("Papagaio", "ave","Frugívoro", 0.3, 2);
        List<Animal> animais = new ArrayList<>();
        animais.add(animal1);
        animais.add(animal2);
        animais.add(animal3);

        AnimalService service = new AnimalService();
        List<Animal> listaDeMamiferosComPesoMenorQue5 = service.listaDeAnimaisDoTipoNComPesoMenorQue(animais, 5, "mamifero");

        assertEquals(1, listaDeMamiferosComPesoMenorQue5.size());
        assertEquals("Gato", listaDeMamiferosComPesoMenorQue5.get(0).getNome());
    }

}