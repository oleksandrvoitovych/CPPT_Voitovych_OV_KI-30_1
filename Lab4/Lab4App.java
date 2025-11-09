package KI30.Voitovych.Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Драйвер для лабораторної роботи 4.
 * Зчитує x з консолі, обчислює y = sin(x)/cos(x) і записує результат у файл.
 *
 * @author Войтович
 * @version 1.0
 */
public class Lab4App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter fout = null;

        try {
            System.out.print("Enter output file name (e.g. result.txt): ");
            String fileName = in.nextLine();

            // Відкриваємо файл для запису результату
            fout = new PrintWriter(new File(fileName));

            System.out.print("Enter X (integer degrees): ");
            String xStr = in.nextLine();

            int x;
            try {
                x = Integer.parseInt(xStr.trim());
            } catch (NumberFormatException nfe) {
                throw new CalcException("Invalid input: X must be an integer. You entered: " + xStr);
            }

            TrigEquation eq = new TrigEquation();

            double result = eq.calculate(x);

            // Вивід на екран та у файл
            String outLine = "x = " + x + " deg; y = sin(x)/cos(x) = " + result;
            System.out.println(outLine);
            fout.println(outLine);

        } catch (CalcException ce) {
            // Помилки обчислення або валідації вводу
            System.err.println("Calculation error: " + ce.getMessage());
            if (fout != null) fout.println("Calculation error: " + ce.getMessage());
        } catch (FileNotFoundException fe) {
            // Помилка створення/відкриття файлу
            System.err.println("File error: unable to create or open file. " + fe.getMessage());
        } catch (Exception ex) {
            // Інші непередбачувані можливі помилки
            System.err.println("Unexpected error: " + ex.getMessage());
            if (fout != null) fout.println("Unexpected error: " + ex.getMessage());
        } finally {
            // Коректне завершення роботи з файлом (буде виконано завжди)
            if (fout != null) {
                fout.flush();
                fout.close();
            }
            // Не закриваємо Scanner(System.in) навмисно, бо може впливати на інші частини програми/IDE
        }
    }
}
