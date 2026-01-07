package KI30.Voitovych.Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Точка входу для лабораторної роботи №4.
 * Зчитує ім'я вихідного файлу і значення x (в градусах),
 * обчислює y = sin(x)/cos(x) та записує результат у файл.
 */
public class Lab4App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = null;

        try {
            System.out.print("Enter output file name (e.g. result.txt): ");
            String fileName = in.nextLine();
            out = new PrintWriter(new File(fileName));

            System.out.print("Enter X (integer degrees): ");
            String raw = in.nextLine();

            int x;
            try {
                x = Integer.parseInt(raw.trim());
            } catch (NumberFormatException e) {
                throw new CalcException("Invalid input: X must be an integer. You entered: " + raw);
            }

            TrigEquation eq = new TrigEquation();
            double y = eq.calculate(x);

            String line = "x = " + x + " deg; y = sin(x)/cos(x) = " + y;
            System.out.println(line);
            out.println(line);

        } catch (CalcException e) {
            System.err.println("Calculation error: " + e.getMessage());
            if (out != null) out.println("Calculation error: " + e.getMessage());

        } catch (FileNotFoundException e) {
            System.err.println("File error: unable to create or open file. " + e.getMessage());

        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
            if (out != null) out.println("Unexpected error: " + e.getMessage());

        } finally {
            if (out != null) {
                out.flush();
                out.close();
            }
            in.close();
        }
    }
}
