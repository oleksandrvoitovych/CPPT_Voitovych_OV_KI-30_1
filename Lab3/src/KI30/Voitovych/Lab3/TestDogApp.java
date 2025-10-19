package KI30.Voitovych.Lab3;

import java.io.FileNotFoundException;

/**
 * Драйвер для TestDog
 */
public class TestDogApp {
    public static void main(String[] args) {
        try {
            TestDog rex = new TestDog("Rex");
            rex.bark();
            rex.prepareForExperiment("Temp=22;Time=5min");
            rex.performExperiment("Protocol-1");
            System.out.println("Report: " + rex.getLastExperimentReport());
            rex.sleep();
            rex.dispose();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Cannot create log file.");
        }
    }
}
