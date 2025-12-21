from TestDog import TestDog

if __name__ == "__main__":
    # Створюємо піддослідного пса
    # Параметри: кличка, вік, вага (кг), номер досліду, максимум тестів на місяць
    test_dog = TestDog("Рекс", 3, 25, "LAB-001", 5)

    # Виводимо початковий стан
    print("\n1. Початковий стан:")
    print(test_dog.get_status())

    # Спробуємо провести тест - має вийти
    print("\n2. Перший тест:")
    test_dog.conduct_test()
    print(test_dog.get_status())

    # Даємо відпочити
    print("\n3. Відпочинок:")
    test_dog.rest()
    print(test_dog.get_status())

    # Годуємо собаку
    print("\n4. Годування:")
    test_dog.feed()
    print(test_dog.get_status())

    # Робимо ще два тести, щоб викликати необхідність ветогляду
    print("\n5. Ще два тести підряд:")
    test_dog.conduct_test()
    test_dog.rest()
    test_dog.conduct_test()
    test_dog.rest()
    print(test_dog.get_status())

    # Спробуємо провести тест без ветогляду
    print("\n6. Спроба тесту без ветогляду:")
    test_dog.conduct_test()

    # Проводимо ветогляд
    print("\n7. Проведення ветогляду:")
    test_dog.vet_checkup()
    print(test_dog.get_status())

    # Відновлюємо енергію
    print("\n8. Відновлення енергії:")
    test_dog.restore_energy()
    print(test_dog.get_status())

    # Робимо ще два тести
    print("\n9. Ще два тести:")
    test_dog.conduct_test()
    test_dog.rest()
    test_dog.conduct_test()  # П'ятий тест - останній можливий на місяць
    test_dog.rest()
    print(test_dog.get_status())

    # Спробуємо провести тест після досягнення місячного ліміту
    print("\n10. Спроба тесту після досягнення місячного ліміту:")
    test_dog.conduct_test()

    # Перевіряємо фінальний стан
    print("\n11. Фінальний стан:")
    print(test_dog.get_status())

    # Демонструємо всі атрибути об'єкта
    print("\n12. Всі атрибути піддослідного пса:")
    print(f"Кличка: {test_dog.name}")
    print(f"Вік: {test_dog.age} років")
    print(f"Вага: {test_dog.weight} кг")
    print(f"Номер досліду: {test_dog.experiment_number}")
    print(f"Енергія: {test_dog.current_energy}/{test_dog.max_energy}")
    print(f"Максимум тестів на місяць: {test_dog.max_tests}")
    print(f"Проведено тестів: {test_dog.tests_completed}")
    print(f"Потребує ветогляду: {test_dog.needs_vet_check}")
    print(f"В процесі тесту: {test_dog.is_active}")
