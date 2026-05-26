package it.unisa.torneocalcio.classi;

import java.util.Objects;

/**
 * Classe che gestisce il salvataggio e il caricamento del torneo.
 */
public class ArchivioTorneo {

    private final String percorsoFile;

    /**
     * Costruttore della classe ArchivioTorneo.
     *
     * @param percorsoFile percorso del file usato per salvare i dati
     */
    public ArchivioTorneo(String percorsoFile) {
        this.percorsoFile = percorsoFile;
    }

    /**
     * Salva il torneo su file.
     *
     * @param torneo torneo da salvare
     */
    public void salva(Torneo torneo) {
        Objects.requireNonNull(torneo, "torneo");
        throw new UnsupportedOperationException("Metodo salva() non implementato");
    }

    /**
     * Carica il torneo da file.
     *
     * @return torneo caricato
     */
    public Torneo carica() {
        throw new UnsupportedOperationException("Metodo carica() non implementato");
    }

    /**
     * Restituisce il percorso del file.
     *
     * @return percorso del file
     */
    public String getPercorsoFile() {
        return percorsoFile;
    }
}
