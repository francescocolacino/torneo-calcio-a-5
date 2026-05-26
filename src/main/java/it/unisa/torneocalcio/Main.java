package it.unisa.torneocalcio;

import it.unisa.torneocalcio.classi.Torneo;

/**
 * Classe principale di avvio dell'applicazione.
 */
public class Main {

    /**
     * Metodo main dell'applicazione.
     *
     * @param args argomenti da linea di comando
     */
    public static void main(String[] args) {
        Torneo torneo = new Torneo("Torneo Calcio a 5");

        System.out.println("Applicazione Torneo Calcio a 5 avviata.");
        System.out.println("Torneo creato: " + torneo.getNome());
        System.out.println("Numero squadre iniziali: " + torneo.getSquadre().size());
        System.out.println("Numero partite iniziali: " + torneo.getPartite().size());
    }
}