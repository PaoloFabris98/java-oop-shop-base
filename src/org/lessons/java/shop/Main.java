package org.lessons.java.shop;

import java.util.ArrayList;
import org.lessons.java.shop.Prodotto;

public class Main {
    public static void main(String[] args) {
        ArrayList<Prodotto> shopProduct = new ArrayList<>();
        String[] items = { "Carta", "Mela", "Biscotti" };
        String[] description = { "Pulizia Casa", "Frutta", "Prodotti per la Colazione" };
        Double[] prezzo = { 3.4, 5.2, 8.9 };
        Double[] iva = { 22.0, 4.0, 18.0 };

        for (int i = 0; i < items.length; i++) {
            shopProduct.add(new Prodotto(items[i], description[i], prezzo[i], iva[i]));
            Prodotto currentItem = shopProduct.get(i);
            System.out.println(currentItem.codice);
            System.out.println(currentItem.nome);
            System.out.println("Descrizione prodotto: " + currentItem.descrizione);
            System.out.println("Prezzo: " + currentItem.showPryce() + " euro");
            System.out.println("Iva: " + currentItem.iva + "%");
            System.out.println("Prezzo Ivato: " + currentItem.showPryceTaxed() + " euro");
            System.out.println(currentItem.codeName());
            System.out.println("\n");
        }

    }
}
