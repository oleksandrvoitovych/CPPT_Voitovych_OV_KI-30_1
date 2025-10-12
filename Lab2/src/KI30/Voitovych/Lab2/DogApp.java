package KI30.Voitovych.Lab2;

import java.io.*;

/**
 * Клас-драйвер <code>DogApp</code> демонструє роботу класу Dog.
 */
public class DogApp {

    public static void main(String[] args) throws FileNotFoundException {
        Dog dog = new Dog("Барсик", new Paw(), new Tail(), new Fur());
        dog.bark();
        dog.run();
        dog.wagTail();
        dog.wash();
        dog.sleep();
        dog.showInfo();
        dog.dispose();
    }
}
