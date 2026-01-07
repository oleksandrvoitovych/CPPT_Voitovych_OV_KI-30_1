package KI30.Voitovych.Lab3;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Утиліти для роботи зі списками тварин.
 */
public class DogUtils {

    public static void printAll(ArrayList<Animal> animals) {
        System.out.println("===== СПИСОК ТВАРИН =====");
        for (Animal a : animals) {
            a.info();
            a.makeSound();
        }
        System.out.println("========================");
    }

    public static void sortByAge(ArrayList<Animal> animals) {
        animals.sort(Comparator.comparingInt(Animal::getAge));
    }

    public static ArrayList<Animal> filterByMinAge(ArrayList<Animal> animals, int minAge) {
        ArrayList<Animal> res = new ArrayList<>();
        for (Animal a : animals) {
            if (a.getAge() >= minAge) res.add(a);
        }
        return res;
    }
}
