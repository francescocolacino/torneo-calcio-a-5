package it.unisa.torneocalcio.classi;

import java.time.LocalDate;

/**
 * Classe che rappresenta un giocatore del torneo.
 */
public class Giocatore {

    private final String nome;
    private final String cognome;
    private final LocalDate dataNascita;

    /**
     * Costruttore della classe Giocatore.
     *
     * @param nome nome del giocatore
     * @param cognome cognome del giocatore
     * @param dataNascita data di nascita del giocatore
     */
    public Giocatore(String nome, String cognome, LocalDate dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    /**
     * Restituisce il nome del giocatore.
     *
     * @return nome del giocatore
     */
    public String getNome() {
        return nome;
    }

    /**
     * Restituisce il cognome del giocatore.
     *
     * @return cognome del giocatore
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Restituisce la data di nascita del giocatore.
     *
     * @return data di nascita del giocatore
     */
    public LocalDate getDataNascita() {
        return dataNascita;
    }
}