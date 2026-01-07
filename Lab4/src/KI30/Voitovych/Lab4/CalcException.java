package KI30.Voitovych.Lab4;

/**
 * Користувацький виняток для помилок обчислення.
 */
public class CalcException extends ArithmeticException {

    /** Конструктор без повідомлення. */
    public CalcException() {
        super();
    }

    /**
     * Конструктор з повідомленням.
     * @param message текст помилки
     */
    public CalcException(String message) {
        super(message);
    }
}
