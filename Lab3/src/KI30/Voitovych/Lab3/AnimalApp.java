package KI30.Voitovych.Lab3;

import java.util.ArrayList;

/**
 * Драйвер лабораторної роботи №3.
 */
public class AnimalApp {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        Dog rex = new Dog("Рекс", 4, "Вівчарка");
        ServiceDog bars = new ServiceDog("Барс", 6, "Малінуа", "Охорона");

        animals.add(rex);
        animals.add(bars);

        // 1) Друк списку (поліморфізм)
        DogUtils.printAll(animals);

        // 2) Демонстрація методів
        rex.eat("корм");
        rex.train(30);
        rex.fetch();
        rex.sleep();

        System.out.println();

        bars.eat("м'ясо");
        bars.train(40);
        bars.work();
        bars.doExperiment("Реакція на світло");
        bars.sleep();

        // 3) Сортування
        System.out.println("\n--- Сортуємо за віком ---");
        DogUtils.sortByAge(animals);
        DogUtils.printAll(animals);

        // 4) Фільтрація
        System.out.println("\n--- Фільтр: вік >= 5 ---");
        ArrayList<Animal> filtered = DogUtils.filterByMinAge(animals, 5);
        DogUtils.printAll(filtered);
    }
}
