package org.lessons.java.shop;

public class Cuffie extends Prodotto{
//    Attributi
    private String colore;
    private boolean wireless;
//    Costruttore
    public Cuffie(String nome, String descrizione, double prezzo, int iva, String colore, boolean wireless) {
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

//    Metodi

    public String getColore() {
        return colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
