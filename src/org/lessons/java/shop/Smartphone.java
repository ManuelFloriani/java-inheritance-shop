package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto{
// Attributi
    private int imeiCode;
    private int phoneMemory;


    //    Costruttore
    public Smartphone(String nome, String descrizione, double prezzo, int iva, int phoneMemory) {
        super(nome, descrizione, prezzo, iva);
        this.phoneMemory = phoneMemory;
        Random randomGen = new Random();
        this.imeiCode = randomGen.nextInt(0,10000000);
    }

//    Metodi

    public int getImeiCode() {
        return imeiCode;
    }

    public int getPhoneMemory() {
        return phoneMemory;
    }

    public void setPhoneMemory(int phoneMemory) {
        this.phoneMemory = phoneMemory;
    }
}
