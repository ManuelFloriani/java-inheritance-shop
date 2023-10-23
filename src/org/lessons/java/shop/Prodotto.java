package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
//    Dichiarazione attributi

    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    //    Dichiarazione costruttori
    public Prodotto(String nome, String descrizione, double prezzo, int iva){
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

        Random randomGen = new Random();
        this.codice = randomGen.nextInt(0,99);

    }

    //    Dichiarazione metodi
    // Codice
    public int getCodice(){
        return codice;
    }
    // Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Descrizione
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    //Prezzo
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    //Iva
    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

//    Metodi utility


    //    Metodo per avere il prezzo comprensivo di iva
    public double getFullPrice(){
        return prezzo + (prezzo * iva / 100);
    }

    //    Metodo per avere il nome completo del prodotto (codice-nome)
    public String getFullProductName(){
        return codice + "-" + nome;
    }
}

