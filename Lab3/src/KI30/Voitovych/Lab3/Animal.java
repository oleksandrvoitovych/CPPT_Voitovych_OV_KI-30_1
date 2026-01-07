package KI30.Voitovych.Lab3;

/**
 * Абстрактний клас, який задає спільні властивості тварин.
 */
public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** Абстрактний метод — кожен нащадок реалізує по-своєму */
    public abstract void makeSound();

    public void info() {
        System.out.println("[INFO] Ім'я: " + name + ", вік: " + age);
    }

    public void sleep() {
        System.out.println("[ACTION] " + name + " спить...");
    }

    public void eat(String food) {
        System.out.println("[ACTION] " + name + " їсть: " + food);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
