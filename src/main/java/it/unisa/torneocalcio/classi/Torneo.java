package it.unisa.torneocalcio.classi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe principale che rappresenta il torneo.
 */
public class Torneo {

    private final String nome;
    private final List<Squadra> squadre;
    private final List<Partita> partite;

    /**
     * Costruttore della classe Torneo.
     *
     * @param nome nome del torneo
     */
    public Torneo(String nome) {
        this.nome = nome;
        this.squadre = new ArrayList<>();
        this.partite = new ArrayList<>();
    }

    /**
     * Aggiunge una squadra al torneo.
     *
     * @param squadra squadra da aggiungere
     */
    public void aggiungiSquadra(Squadra squadra) {
        squadre.add(squadra);
    }

    /**
     * Modifica il nome di una squadra.
     *
     * @param squadra squadra da modificare
     * @param nuovoNome nuovo nome della squadra
     */
    public void modificaSquadra(Squadra squadra, String nuovoNome) {
        squadra.modificaNome(nuovoNome);
    }

    /**
     * Elimina una squadra dal torneo.
     *
     * @param squadra squadra da eliminare
     */
    public void eliminaSquadra(Squadra squadra) {
        squadre.remove(squadra);
    }

    /**
     * Aggiunge un giocatore a una squadra.
     *
     * @param squadra squadra scelta
     * @param giocatore giocatore da aggiungere
     */
    public void aggiungiGiocatoreASquadra(Squadra squadra, Giocatore giocatore) {
        squadra.aggiungiGiocatore(giocatore);
    }

    /**
     * Aggiunge una partita al torneo.
     *
     * @param partita partita da aggiungere
     */
    public void aggiungiPartita(Partita partita) {
        partite.add(partita);
    }

    /**
     * Modifica una partita già inserita.
     *
     * @param partita partita da modificare
     * @param nuovaData nuova data della partita
     * @param goalCasa goal della squadra di casa
     * @param goalOspite goal della squadra ospite
     */
    public void modificaPartita(Partita partita, LocalDate nuovaData, int goalCasa, int goalOspite) {
        partita.modificaData(nuovaData);
        partita.modificaRisultato(goalCasa, goalOspite);
    }

    /**
     * Elimina una partita dal torneo.
     *
     * @param partita partita da eliminare
     */
    public void eliminaPartita(Partita partita) {
        partite.remove(partita);
    }

    /**
     * Cerca una squadra tramite nome.
     *
     * @param nome nome della squadra
     * @return squadra trovata oppure null
     */
    public Squadra cercaSquadra(String nome) {
        for (Squadra squadra : squadre) {
            if (squadra.getNome().equals(nome)) {
                return squadra;
            }
        }

        return null;
    }

    /**
     * Cerca una partita tra quelle registrate.
     *
     * @param partita partita da cercare
     * @return partita trovata oppure null
     */
    public Partita cercaPartita(Partita partita) {
        for (Partita p : partite) {
            if (p == partita) {
                return p;
            }
        }

        return null;
    }

    /**
     * Restituisce la classifica aggiornata.
     *
     * @return classifica del torneo
     */
    public Classifica getClassifica() {
        Classifica classifica = new Classifica();
        classifica.calcolaClassifica(squadre, partite);
        return classifica;
    }

    /**
     * Restituisce il nome del torneo.
     *
     * @return nome del torneo
     */
    public String getNome() {
        return nome;
    }

    /**
     * Restituisce la lista delle squadre.
     *
     * @return lista delle squadre
     */
    public List<Squadra> getSquadre() {
        return squadre;
    }

    /**
     * Restituisce la lista delle partite.
     *
     * @return lista delle partite
     */
    public List<Partita> getPartite() {
        return partite;
    }
}