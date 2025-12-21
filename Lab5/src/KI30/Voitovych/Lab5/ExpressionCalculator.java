package KI30.Voitovych.Lab5;

import java.io.*;

/**
 * Клас для обчислення виразу y = sin(x)/cos(x)
 * та запису/читання результату у файл
 */
public class ExpressionCalculator {

    /**
     * Обчислення значення виразу
     */
    public double calculate(double x) {

        // Перевірка: якщо cos(x) ≈ 0 — забороняємо ділення
        if (Math.abs(Math.cos(x)) < 0.00001) {
            throw new IllegalArgumentException("cos(x) дорівнює 0 або дуже близький до 0. Ділити не можна!");
        }

        return Math.sin(x) / Math.cos(x);
    }

    /**
     * Запис у текстовий файл
     */
    public void writeResultToFile(double result, String filePath) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println(result);
        }
    }

    /**
     * Читання з текстового файлу
     */
    public double readResultFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return Double.parseDouble(reader.readLine());
        }
    }

    /**
     * Запис у бінарний файл
     */
    public void writeResultToBinaryFile(double result, String filePath) throws IOException {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(filePath))) {
            out.writeDouble(result);
        }
    }

    /**
     * Читання з бінарного файлу
     */
    public double readResultFromBinaryFile(String filePath) throws IOException {
        try (DataInputStream in = new DataInputStream(new FileInputStream(filePath))) {
            return in.readDouble();
        }
    }
}
