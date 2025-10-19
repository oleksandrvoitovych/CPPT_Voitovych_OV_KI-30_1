package KI30.Voitovych.Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Абстрактний суперклас Dog
 */
public abstract class Dog {
    protected String name;
    protected PrintWriter log;

    public Dog(String name) throws FileNotFoundException {
        this.name = name;
        this.log = new PrintWriter(new File(name + "_DogLog.txt"));
        log.println("Created Dog: " + name);
        log.flush();
    }

    public void bark() {
        System.out.println(name + ": Гав-гав!");
        log.println(name + " barked.");
        log.flush();
    }

    public void sleep() {
        System.out.println(name + " sleeps.");
        log.println(name + " sleeps.");
        log.flush();
    }

    // Абстрактний метод — підкласи мають реалізувати
    public abstract void performExperiment(String protocol);

    public void dispose() {
        log.println("Disposing Dog: " + name);
        log.close();
    }
}
