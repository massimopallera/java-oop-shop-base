package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    static BigDecimal iva = new BigDecimal(0);

    private int codice; // Random
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;

    Prodotto(){

        Random codice = new Random();

        this.codice =  codice.nextInt(99999);
        this.nome = null;
        this.descrizione = null;
        this.prezzo = null;
    }

    Prodotto(String nome, String descrizione, BigDecimal prezzo){

        Random codice = new Random();

        this.codice =  codice.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;

    }

    public BigDecimal getPrezzo(){
        return (this.prezzo != null) ? this.prezzo.setScale(2, RoundingMode.FLOOR) : null;
    }

    public void setPrezzo(BigDecimal prezzo){
        //signum controlla il segno del valore prezzo, restituendo -1 se negativo, 0 se 0 e 1 se positivo
        this.prezzo = prezzo.signum() == 1 ? prezzo : this.prezzo;
    }
    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = !nome.equals("") ? nome : "Prodotto Senza Nome";
    }
    
    public String getDescrizione(){
        return this.descrizione;
    }

    public void setDescrizione(String descrizione){
        this.descrizione = !descrizione.equals("") ? descrizione : "Prodotto Senza descrizione";
    }

    public int getCodice(){
        return this.codice;
    }
    
    // Metodi aggiuntivi
    public String getNomeEsteso(){        
        return this.nome != null ? this.codice + "-" + this.nome.replaceAll("\\s","").trim() : null;
    }

    public BigDecimal getPrezzoConIva(){
        return this.prezzo != null ? (this.prezzo.add(this.prezzo.multiply(iva))).setScale(2,RoundingMode.FLOOR) : null;
    }

}
