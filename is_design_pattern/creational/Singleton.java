package creational;

/**
 * I pattern creazionali si occupano dei meccanismi di creazione degli oggetti, cercando di creare oggetti in modo adatto alla situazione.
 */
public class Singleton {

    /**
     * SINGLETONE
     * Scopo: Garantire che una classe abbia una sola istanza e fornire un punto di accesso globale a essa.
     * Quando usarlo:
     * <p>
     * Quando è necessaria esattamente una istanza di una classe
     * Per gestire risorse condivise (connessioni al database, file manager)
     * Per servizi centralizzati (logging, configurazione)
     */

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
