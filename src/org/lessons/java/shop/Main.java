package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        final int iva = 22; // cant be changed -- use the percentage without % :))

        Prodotto cinquecento = new Prodotto("Fiat 500", "Golosa macchina da combattimento urbano", 5000.50, iva);

        System.out.println(cinquecento.getNomeEsteso());
        System.out.println(cinquecento.getNomeEsteso());
        System.out.println(cinquecento.getPrezzo());
        System.out.println(cinquecento.getPrezzoConIva());

    }
}
