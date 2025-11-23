package exceptions;

/**
 * Levée quand un téléchargement est impossible.
 */
public class TelechargementImpossibleException extends Exception {
    public TelechargementImpossibleException(String message) { super(message); }
}
