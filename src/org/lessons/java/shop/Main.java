package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Prodotto.iva = new BigDecimal(.22);

        Prodotto cinquecento = new Prodotto("Fiat 500", "Golosa macchina da combattimento urbano", new BigDecimal(22000.65));
        Prodotto vuoto = new Prodotto();

        System.out.println(vuoto.getNomeEsteso());
        System.out.println(vuoto.getPrezzo());
        System.out.println(vuoto.getPrezzoConIva());
        System.out.println(vuoto.getDescrizione());
        System.out.println(vuoto.getCodice());
        System.out.println(vuoto.getDescrizione());


    }
}
