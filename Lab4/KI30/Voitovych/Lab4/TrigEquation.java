package KI30.Voitovych.Lab4;

/**
 * Клас <code>TrigEquation</code> реалізує метод обчислення виразу
 * y = sin(x) / cos(x). Вхідний параметр x розглядається в градусах.
 *
 * @author Войтович
 * @version 1.0
 */
public class TrigEquation {

    /**
     * Обчислює y = sin(x) / cos(x) для x у градусах.
     *
     * @param xAngleDeg кут у градусах
     * @return значення виразу (тип double)
     * @throws CalcException якщо cos(x) ~ 0 (ділення на нуль) або результат невалідний
     */
    public double calculate(int xAngleDeg) throws CalcException {
        // Перетворення градусів у радіани
        double rad = xAngleDeg * Math.PI / 180.0;

        // Обчислюємо cos і sin
        double cos = Math.cos(rad);
        double sin = Math.sin(rad);

        // Порог для виявлення "майже нуля" (більш-менш надійний)
        final double EPS = 1e-12;

        // Перевірка ділення на нуль
        if (Math.abs(cos) < EPS) {
            // конкретизуємо причину — які значення градусів дають косинус ~ 0:
            // x = 90 + k*180
            throw new CalcException("Illegal value: cos(x) is zero (x = " + xAngleDeg + " degrees). Division by zero.");
        }

        double y = sin / cos; // це справжнє tan(x)

        // Перевірка на числові аномалії
        if (Double.isNaN(y) || Double.isInfinite(y)) {
            throw new CalcException("Computation resulted in non-finite value for x = " + xAngleDeg);
        }

        return y;
    }
}
