package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    int codice; // Random
    String nome;
    String descrizione;
    double prezzo;
    int iva;

    Prodotto(String nome, String descrizione, double prezzo, int iva){

        Random codice = new Random();

        this.codice =  codice.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    public double getPrezzo(){
        return this.prezzo;
    }

    public double getPrezzoConIva(){
        return this.prezzo+(this.prezzo*iva/100);
    }

    public String getNomeEsteso(){        
        return this.codice + "-" + this.nome.replaceAll("\\s","").trim();
    }

}
