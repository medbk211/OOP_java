package exceptions;

/**
 * Levée pour des erreurs liées aux dates ou capacité des événements.
 */
public class EvenementDateException extends Exception {
    public EvenementDateException(String message) { super(message); }
}
