package exceptions;

/**
 * Levée quand on tente d'accéder à un contenu non publié / masqué.
 */
public class ContenuNonDisponibleException extends Exception {
    public ContenuNonDisponibleException(String message) {
         super(message); }
}
