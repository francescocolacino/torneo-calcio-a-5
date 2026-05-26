package it.unisa.torneocalcio.classi;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe che rappresenta una squadra del torneo.
 */
public class Squadra {

    private String nome;
    private final List<Giocatore> giocatori;

    /**
     * Costruttore della classe Squadra.
     *
     * @param nome nome della squadra
     */
    public Squadra(String nome) {
        this.nome = nome;
        this.giocatori = new ArrayList<>();
    }

    /**
     * Aggiunge un giocatore alla squadra.
     *
     * @param giocatore giocatore da aggiungere
     */
    public void aggiungiGiocatore(Giocatore giocatore) {
        if (giocatori.size() < 5) {
            giocatori.add(giocatore);
        }
    }

    /**
     * Modifica il nome della squadra.
     *
     * @param nuovoNome nuovo nome della squadra
     */
    public void modificaNome(String nuovoNome) {
        this.nome = nuovoNome;
    }

    /**
     * Restituisce il nome della squadra.
     *
     * @return nome della squadra
     */
    public String getNome() {
        return nome;
    }

    /**
     * Restituisce la lista dei giocatori.
     *
     * @return lista dei giocatori
     */
    public List<Giocatore> getGiocatori() {
        return giocatori;
    }
}