package org.example.service;

import org.example.model.Animal;

import java.util.List;

public class AnimalService {
    public List<Animal> listaDeAnimaisPorAlimentacao(List<Animal> animais, String alimentacao) {
        return animais.stream().filter(n -> n.getAlimentacao().equals(alimentacao)).toList();
    }

    public List<Animal> listaDeAnimalPorTipo(List<Animal> animais, String tipo) {
        return animais.stream().filter(n -> n.getTipo().equals(tipo)).toList();
    }
    public List<Animal> listaDeAnimaisDoTipoNComPesoMaiorQue(List<Animal> animais, int peso, String tipo){
            return animais.stream().filter(n -> n.getPeso() > peso &&
                    n.getTipo().equalsIgnoreCase(tipo)).toList();
    }
    public List<Animal> listaDeAnimaisDoTipoNComPesoMenorQue(List<Animal> animais, int peso, String tipo){
        return animais.stream().filter(n -> n.getPeso() < peso &&
                n.getTipo().equalsIgnoreCase(tipo)).toList();
    }
}
