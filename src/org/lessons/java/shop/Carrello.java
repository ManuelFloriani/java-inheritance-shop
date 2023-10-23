package org.lessons.java.shop;


import java.util.Scanner;

public class Carrello {

    private Prodotto[] prodotti;
//    metodo che aggiunge il prodotto all'array
    public void aggiungiProdotto(Prodotto prodotto) {
        if (prodotti == null) {
            prodotti = new Prodotto[1];
            prodotti[0] = prodotto;
        } else {
            Prodotto[] temp = new Prodotto[prodotti.length + 1];
            for (int i = 0; i < prodotti.length; i++) {
                temp[i] = prodotti[i];
            }
            temp[temp.length - 1] = prodotto;
            prodotti = temp;
        }
    }




    public double calcolaTotale() {
        double totale = 0;
        for (Prodotto prodotto : prodotti) {
            totale += prodotto.getFullPrice();
        }
        return totale;
    }

    public static void main(String[] args) {
        Carrello carrello = new Carrello();
        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("INSERISCI IL NOME DEL PRODOTTO (o 'totale' per visualizzare il totale del carrello) ");
            String nome = scanner.nextLine();
            if (nome.equals("totale")) {
                System.out.println("Questo è il totale: " + carrello.calcolaTotale() + "€");
                for (Prodotto prodotto : carrello.prodotti) {
                    System.out.println("Nome: " + prodotto.getNome());
                    System.out.println("Descrizione: " + prodotto.getDescrizione());
                    System.out.println("Prezzo: " + prodotto.getPrezzo() + "€");
                    System.out.println("Iva: " + prodotto.getIva() + "%");
                    System.out.println("Prezzo totale: " + prodotto.getFullPrice() + "€");
                    System.out.println("Codice: " + prodotto.getCodice());
                    if (prodotto instanceof Smartphone) {
                        Smartphone smartphone = (Smartphone) prodotto;
                        System.out.println("Memoria: " + smartphone.getPhoneMemory() + "GB");
                        System.out.println("Imei: " + smartphone.getImeiCode());
                    } else if (prodotto instanceof Televisore) {
                        Televisore televisore = (Televisore) prodotto;
                        System.out.println("Dimensioni: " + televisore.getDimensionThumbs() + " pollici");
                        System.out.println("Smart tv: " + televisore.isSmartTv());
                    } else if (prodotto instanceof Cuffie) {
                        Cuffie cuffie = (Cuffie) prodotto;
                        System.out.println("Colore: " + cuffie.getColore());
                        System.out.println("Wireless: " + cuffie.isWireless());
                    }
                    System.out.println("------------------------------------------------");
                }
                break;
            }
            System.out.print("Descrizione: ");
            String descrizione = scanner.nextLine();
            System.out.print("Prezzo: ");
            double prezzo = scanner.nextDouble();
            scanner.nextLine(); // Consuma il newline residuo
            System.out.print("IVA: ");
            int iva = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline residuo
            System.out.println("Inserisci il tipo di prodotto (Smartphone, Televisore, Cuffie) o 'totale' per uscire:");
            String scelta = scanner.nextLine();

            if (scelta.equals("Smartphone")) {
                System.out.print("Memoria (GB): ");
                int memoria = scanner.nextInt();
                scanner.nextLine();
                Smartphone smartphone = new Smartphone(nome, descrizione, prezzo, iva, memoria);
                carrello.aggiungiProdotto(smartphone);
            } else if (scelta.equals("Televisore")) {
                System.out.print("Dimensioni: ");
                int dimensioni = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Smart tv (true o false): ");
                boolean smart = Boolean.parseBoolean(scanner.nextLine());
                Televisore televisore = new Televisore(nome, descrizione, prezzo, iva, dimensioni, smart);
                carrello.aggiungiProdotto(televisore);
            } else if (scelta.equals("Cuffie")) {
                System.out.print("Colore: ");
                String colore = scanner.nextLine();
                System.out.print("Wireless (true o false): ");
                boolean wireless = Boolean.parseBoolean(scanner.nextLine());
                Cuffie cuffie = new Cuffie(nome, descrizione, prezzo, iva, colore, wireless);
                carrello.aggiungiProdotto(cuffie);
            } else {
                System.out.println("Scelta non valida. Riprova.");
            }
        }


    }
}
