package it.unisa.torneocalcio.classi;

import java.time.LocalDate;

/**
 * Classe che rappresenta una partita del torneo.
 */
public class Partita {

    private LocalDate data;
    private final Squadra squadraCasa;
    private final Squadra squadraOspite;
    private int goalCasa;
    private int goalOspite;

    /**
     * Costruttore della classe Partita.
     *
     * @param data data della partita
     * @param squadraCasa squadra di casa
     * @param squadraOspite squadra ospite
     * @param goalCasa goal della squadra di casa
     * @param goalOspite goal della squadra ospite
     */
    public Partita(LocalDate data, Squadra squadraCasa, Squadra squadraOspite, int goalCasa, int goalOspite) {
        this.data = data;
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.goalCasa = goalCasa;
        this.goalOspite = goalOspite;
    }

    /**
     * Modifica la data della partita.
     *
     * @param nuovaData nuova data della partita
     */
    public void modificaData(LocalDate nuovaData) {
        this.data = nuovaData;
    }

    /**
     * Modifica il risultato della partita.
     *
     * @param goalCasa goal della squadra di casa
     * @param goalOspite goal della squadra ospite
     */
    public void modificaRisultato(int goalCasa, int goalOspite) {
        this.goalCasa = goalCasa;
        this.goalOspite = goalOspite;
    }

    /**
     * Restituisce la squadra vincitrice.
     *
     * @return squadra vincitrice oppure null in caso di pareggio
     */
    public Squadra getVincitore() {
        if (goalCasa > goalOspite) {
            return squadraCasa;
        }

        if (goalOspite > goalCasa) {
            return squadraOspite;
        }

        return null;
    }

    /**
     * Verifica se la partita è finita in pareggio.
     *
     * @return true se la partita è pareggiata, false altrimenti
     */
    public boolean isPareggio() {
        return goalCasa == goalOspite;
    }

    /**
     * Restituisce la data della partita.
     *
     * @return data della partita
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Restituisce la squadra di casa.
     *
     * @return squadra di casa
     */
    public Squadra getSquadraCasa() {
        return squadraCasa;
    }

    /**
     * Restituisce la squadra ospite.
     *
     * @return squadra ospite
     */
    public Squadra getSquadraOspite() {
        return squadraOspite;
    }

    /**
     * Restituisce i goal della squadra di casa.
     *
     * @return goal casa
     */
    public int getGoalCasa() {
        return goalCasa;
    }

    /**
     * Restituisce i goal della squadra ospite.
     *
     * @return goal ospite
     */
    public int getGoalOspite() {
        return goalOspite;
    }
}