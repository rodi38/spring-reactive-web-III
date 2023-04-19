package tech.ada.mercado.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Mercado {
    private String id;
    private String nome;
    private String moeda;
    private String saldo;

    public Mercado update(Mercado mercado) {
        this.setNome(mercado.nome);
        this.setMoeda(mercado.moeda);
        this.setSaldo(mercado.saldo);
        return this;
    }
}
