package KI30.Voitovych.Lab2;

import java.io.*;

/**
 * Клас <code>Dog</code> описує пса та його поведінку.
 */
public class Dog {

    private String name;
    private Paw paw;
    private Tail tail;
    private Fur fur;
    private PrintWriter log;

    /** Конструктор без параметрів */
    public Dog() throws FileNotFoundException {
        this("Безіменний", new Paw(), new Tail(), new Fur());
    }

    /** Конструктор з параметрами */
    public Dog(String name, Paw paw, Tail tail, Fur fur) throws FileNotFoundException {
        this.name = name;
        this.paw = paw;
        this.tail = tail;
        this.fur = fur;
        this.log = new PrintWriter(new File("DogLog.txt"));
        log.println("Створено пса: " + name);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    /** Метод змушує пса гавкати */
    public void bark() {
        System.out.println(name + " гавкає: Гав-гав!");
        log.println(name + " гавкнув.");
        log.flush();
    }

    /** Метод змушує пса бігти */
    public void run() {
        System.out.println(name + " біжить!");
        paw.move();
        tail.wag();
        log.println(name + " побіг.");
        log.flush();
    }

    /** Метод змушує пса спати */
    public void sleep() {
        System.out.println(name + " спить...");
        log.println(name + " заснув.");
        log.flush();
    }

    /** Метод змінює стан шерсті */
    public void wash() {
        fur.clean();
        log.println(name + " помився.");
        log.flush();
    }

    /** Метод змінює стан хвоста */
    public void wagTail() {
        tail.wag();
        log.println(name + " махає хвостом.");
        log.flush();
    }

    /** Метод змінює стан лап */
    public void shakePaw() {
        paw.move();
        log.println(name + " подав лапу.");
        log.flush();
    }

    /** Метод показує стан пса */
    public void showInfo() {
        System.out.println("Ім’я: " + name);
        System.out.println("Хвіст: " + tail.getState());
        System.out.println("Шерсть: " + fur.getState());
        log.println("Показано інформацію про пса.");
        log.flush();
    }

    /** Метод для закриття файлу логу */
    public void dispose() {
        log.println("Завершено роботу з псом.");
        log.close();
    }
}
