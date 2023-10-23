package org.lessons.java.shop;

public class Televisore extends Prodotto{
//    Attributi
    private int dimensionThumbs;
    private boolean smartTv;

//    Costruttore
    public Televisore(String nome, String descrizione, double prezzo, int iva, int dimensionThumbs, boolean smartTv) {
        super(nome, descrizione, prezzo, iva);
        this.dimensionThumbs = dimensionThumbs;
        this.smartTv = smartTv;
    }

//    Metodi

    public int getDimensionThumbs() {
        return dimensionThumbs;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    public void setDimensionThumbs(int dimensionThumbs) {
        this.dimensionThumbs = dimensionThumbs;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }
}
