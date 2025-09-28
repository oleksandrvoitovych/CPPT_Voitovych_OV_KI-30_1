import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Lab1_Voitovych_KI_301 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        // читаємо розмір матриці
        int n;
        while (true) {
            System.out.print("Введи розмір матриці (>0): ");
            if (in.hasNextInt()) {
                n = in.nextInt();
                in.nextLine(); // з'їсти Enter
                if (n > 0) break;
                System.out.println("Має бути >0");
            } else {
                System.out.println("Введи ціле число!");
                in.next();
            }
        }

        // читаємо символ
        System.out.print("Введи символ-заповнювач: ");
        String filler = in.nextLine();

        if (filler.length() != 1) {
            System.out.println("Треба рівно один символ, інакше стоп.");
            return;
        }
        char f = filler.charAt(0);

        // будуємо зубчатий масив (трикутник зверху вниз)
        int rows = (n + 1) / 2;
        char[][] arr = new char[rows][];
        for (int i = 0; i < rows; i++) {
            int len = n - 2 * i;
            arr[i] = new char[len];
            Arrays.fill(arr[i], f);
        }

        // вивід у консоль і у файл
        File outFile = new File("Lab1_output.txt");
        try (PrintWriter fout = new PrintWriter(outFile)) {
            System.out.println("\nМій трикутник:");
            for (int i = 0; i < rows; i++) {
                // відступи
                for (int s = 0; s < i; s++) System.out.print("  ");
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

                // у файл
                for (int s = 0; s < i; s++) fout.print("  ");
                for (int j = 0; j < arr[i].length; j++) fout.print(arr[i][j] + " ");
                fout.println();
            }
        }

        System.out.println("\nТакож збережено у файл: " + outFile.getAbsolutePath());
    }
}
