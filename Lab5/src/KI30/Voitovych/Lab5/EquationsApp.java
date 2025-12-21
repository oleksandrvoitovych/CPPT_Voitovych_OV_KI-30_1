package KI30.Voitovych.Lab5;

import java.io.IOException;
import java.util.Scanner;

public class EquationsApp {
    public static void main(String[] args) {

        ExpressionCalculator calculator = new ExpressionCalculator();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть x: ");
            double x = scanner.nextDouble();

            double result = calculator.calculate(x);
            System.out.println("Результат: " + result);

            calculator.writeResultToFile(result, "result.txt");
            calculator.writeResultToBinaryFile(result, "result.bin");

            double fromText = calculator.readResultFromFile("result.txt");
            double fromBin = calculator.readResultFromBinaryFile("result.bin");

            System.out.println("З тексту: " + fromText);
            System.out.println("З бінарного файлу: " + fromBin);

        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        scanner.close();
    }
}
