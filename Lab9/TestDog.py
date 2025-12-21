from Dog import Dog


class TestDog(Dog):
    """
    Клас TestDog розширює функціональність базового класу Dog,
    додаючи специфічні для піддослідного собаки характеристики та можливості.
    """

    def __init__(self, name, age, weight, experiment_number, max_tests):
        """
        Ініціалізує об'єкт піддослідного собаки.

        :param name: Кличка собаки
        :param age: Вік собаки
        :param weight: Вага собаки в кілограмах
        :param experiment_number: Номер досліду
        :param max_tests: Максимальна кількість тестів на місяць
        """
        super().__init__(name, age, weight)
        self.experiment_number = experiment_number
        self.max_tests = max_tests
        self.tests_completed = 0
        self.needs_vet_check = False

    def conduct_test(self):
        """
        Проводить тест, враховуючи стан здоров'я та кількість попередніх тестів.

        :return: True, якщо тест можливий, False - якщо тест неможливий
        """
        if self.needs_vet_check:
            print(f"{self.name} потребує ветеринарного огляду перед тестом")
            return False
        if self.tests_completed >= self.max_tests:
            print(f"{self.name} досяг(ла) місячного ліміту тестів")
            return False

        test_successful = super().do_activity()
        if test_successful:
            self.tests_completed += 1
            print(f"Проводиться тест {self.experiment_number}-{self.tests_completed}")
            if self.tests_completed % 3 == 0:
                self.needs_vet_check = True
        return test_successful

    def vet_checkup(self):
        """
        Проводить ветеринарний огляд.
        """
        self.needs_vet_check = False
        print(f"{self.name} пройшов(ла) ветеринарний огляд")

    def get_status(self):
        """
        Отримує поточний статус піддослідного собаки.

        :return: Рядок із загальним статусом, кількістю тестів та станом здоров'я
        """
        basic_status = super().get_status()
        vet_status = "потребує ветогляду" if self.needs_vet_check else "здоровий(а)"
        return f"{basic_status}, тестів: {self.tests_completed}/{self.max_tests}, стан: {vet_status}"
