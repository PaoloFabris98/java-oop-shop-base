package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    int codice = 0;
    String nome = "";
    String descrizione = "";
    double prezzo = 0.0;
    double iva = 0.0;

    public Prodotto(String name, String description, double pryce, double tax) {
        Random random = new Random();
        this.codice = random.nextInt(1000000);
        this.nome = name;
        this.descrizione = description;
        this.prezzo = pryce;
        this.iva = tax;
    }

    double showPryce() {
        return prezzo;
    }

    double showPryceTaxed() {
        return (prezzo + ((prezzo / 100) * iva));
    }

    String codeName() {
        return (codice + nome);
    }

}
