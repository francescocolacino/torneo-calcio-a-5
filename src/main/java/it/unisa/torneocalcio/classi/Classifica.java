package it.unisa.torneocalcio.classi;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe che gestisce la classifica del torneo.
 */
public class Classifica {

    private final List<RigaClassifica> righe;

    /**
     * Costruttore della classe Classifica.
     */
    public Classifica() {
        this.righe = new ArrayList<>();
    }

    /**
     * Calcola la classifica in base alle squadre e alle partite.
     *
     * @param squadre lista delle squadre
     * @param partite lista delle partite
     */
    public void calcolaClassifica(List<Squadra> squadre, List<Partita> partite) {
        righe.clear();

        for (Squadra squadra : squadre) {
            RigaClassifica riga = new RigaClassifica(squadra);
            righe.add(riga);
        }

        for (Partita partita : partite) {
            RigaClassifica rigaCasa = cercaRiga(partita.getSquadraCasa());
            RigaClassifica rigaOspite = cercaRiga(partita.getSquadraOspite());

            if (rigaCasa != null && rigaOspite != null) {
                rigaCasa.aggiornaStatistiche(partita.getGoalCasa(), partita.getGoalOspite());
                rigaOspite.aggiornaStatistiche(partita.getGoalOspite(), partita.getGoalCasa());
            }
        }

        ordinaPerPunti();
    }

    /**
     * Cerca la riga della classifica relativa a una squadra.
     *
     * @param squadra squadra da cercare
     * @return riga della classifica
     */
    private RigaClassifica cercaRiga(Squadra squadra) {
        for (RigaClassifica riga : righe) {
            if (riga.getSquadra().equals(squadra)) {
                return riga;
            }
        }

        return null;
    }

    /**
     * Ordina la classifica in base ai punti.
     */
    private void ordinaPerPunti() {
        for (int i = 0; i < righe.size() - 1; i++) {
            for (int j = i + 1; j < righe.size(); j++) {
                if (righe.get(j).getPunti() > righe.get(i).getPunti()) {
                    RigaClassifica temp = righe.get(i);
                    righe.set(i, righe.get(j));
                    righe.set(j, temp);
                }
            }
        }
    }

    /**
     * Restituisce le righe della classifica.
     *
     * @return lista delle righe della classifica
     */
    public List<RigaClassifica> getRighe() {
        return righe;
    }
}