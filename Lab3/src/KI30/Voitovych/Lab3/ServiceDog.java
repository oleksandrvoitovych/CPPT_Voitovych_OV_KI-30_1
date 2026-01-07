package KI30.Voitovych.Lab3;

/**
 * Піддослідний/службовий пес — розширює Dog.
 */
public class ServiceDog extends Dog {

    private String duty;     // завдання
    private int experiments; // кількість “експериментів”

    public ServiceDog(String name, int age, String breed, String duty) {
        super(name, age, breed);
        this.duty = duty;
    }

    @Override
    public void makeSound() {
        System.out.println("[SOUND] " + getName() + ": Службовий гав!");
    }

    public void work() {
        System.out.println("[WORK] " + getName() + " виконує завдання: " + duty);
    }

    public void doExperiment(String expName) {
        experiments++;
        System.out.println("[EXP] " + getName() + " проходить експеримент #" + experiments + ": " + expName);
    }
}
