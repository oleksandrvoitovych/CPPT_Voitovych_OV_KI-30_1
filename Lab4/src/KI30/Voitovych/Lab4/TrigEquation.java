package KI30.Voitovych.Lab4;

/**
 * Клас для обчислення функції y = sin(x)/cos(x) = tan(x),
 * де x задається в градусах.
 */
public class TrigEquation {

    /**
     * Обчислює y = sin(x)/cos(x) для x у градусах.
     *
     * @param xDegrees кут у градусах (ціле число)
     * @return значення y
     * @throws CalcException якщо cos(x) = 0 або результат некоректний
     */
    public double calculate(int xDegrees) throws CalcException {
        double xRad = xDegrees * Math.PI / 180.0;

        double cos = Math.cos(xRad);
        double sin = Math.sin(xRad);

        // якщо cos дуже близький до 0 — ділення неможливе
        if (Math.abs(cos) < 1e-12) {
            throw new CalcException("Illegal value: cos(x) is zero (x = " + xDegrees +
                    " degrees). Division by zero.");
        }

        double y = sin / cos;

        if (Double.isNaN(y) || Double.isInfinite(y)) {
            throw new CalcException("Computation resulted in non-finite value for x = " + xDegrees);
        }

        return y;
    }
}
