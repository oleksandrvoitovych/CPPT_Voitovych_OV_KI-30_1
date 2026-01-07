package KI30.Voitovych.Lab3;

/**
 * Пес — нащадок Animal.
 */
public class Dog extends Animal implements Trainable {

    private String breed;
    private int energy = 100; // умовна енергія 0..100

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("[SOUND] " + name + ": Гав-гав!");
    }

    public void fetch() {
        energy -= 10;
        System.out.println("[ACTION] " + name + " приносить палицю (energy=" + energy + ")");
    }

    @Override
    public void train(int minutes) {
        energy -= minutes / 2;
        if (energy < 0) energy = 0;
        System.out.println("[TRAIN] " + name + " тренується " + minutes + " хв (energy=" + energy + ")");
    }

    public String getBreed() {
        return breed;
    }
}
