package it.unisa.torneocalcio.classi;

/**
 * Classe che rappresenta una riga della classifica.
 */
public class RigaClassifica {

    private final Squadra squadra;
    private int punti;
    private int partiteGiocate;
    private int vittorie;
    private int pareggi;
    private int sconfitte;
    private int goalFatti;
    private int goalSubiti;

    /**
     * Costruttore della classe RigaClassifica.
     *
     * @param squadra squadra della riga di classifica
     */
    public RigaClassifica(Squadra squadra) {
        this.squadra = squadra;
        this.punti = 0;
        this.partiteGiocate = 0;
        this.vittorie = 0;
        this.pareggi = 0;
        this.sconfitte = 0;
        this.goalFatti = 0;
        this.goalSubiti = 0;
    }

    /**
     * Aggiorna le statistiche della squadra.
     *
     * @param goalFatti goal fatti dalla squadra
     * @param goalSubiti goal subiti dalla squadra
     */
    public void aggiornaStatistiche(int goalFatti, int goalSubiti) {
        partiteGiocate++;
        this.goalFatti += goalFatti;
        this.goalSubiti += goalSubiti;

        if (goalFatti > goalSubiti) {
            vittorie++;
            punti += 3;
        } else if (goalFatti == goalSubiti) {
            pareggi++;
            punti += 1;
        } else {
            sconfitte++;
        }
    }

    /**
     * Restituisce la squadra.
     *
     * @return squadra
     */
    public Squadra getSquadra() {
        return squadra;
    }

    /**
     * Restituisce i punti della squadra.
     *
     * @return punti
     */
    public int getPunti() {
        return punti;
    }

    /**
     * Restituisce il numero di partite giocate.
     *
     * @return partite giocate
     */
    public int getPartiteGiocate() {
        return partiteGiocate;
    }

    /**
     * Restituisce il numero di vittorie.
     *
     * @return vittorie
     */
    public int getVittorie() {
        return vittorie;
    }

    /**
     * Restituisce il numero di pareggi.
     *
     * @return pareggi
     */
    public int getPareggi() {
        return pareggi;
    }

    /**
     * Restituisce il numero di sconfitte.
     *
     * @return sconfitte
     */
    public int getSconfitte() {
        return sconfitte;
    }

    /**
     * Restituisce i goal fatti.
     *
     * @return goal fatti
     */
    public int getGoalFatti() {
        return goalFatti;
    }

    /**
     * Restituisce i goal subiti.
     *
     * @return goal subiti
     */
    public int getGoalSubiti() {
        return goalSubiti;
    }
}