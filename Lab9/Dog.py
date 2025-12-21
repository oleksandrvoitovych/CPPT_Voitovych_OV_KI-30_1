class Dog:
    """
    Клас Dog представляє собаку з базовими характеристиками та функціями.
    """

    def __init__(self, name, age, weight):
        """
        Ініціалізує об'єкт собаки.

        :param name: Кличка собаки
        :param age: Вік собаки
        :param weight: Вага собаки в кілограмах
        """
        self.name = name
        self.age = age
        self.weight = weight
        self.max_energy = 100  # максимальний рівень енергії
        self.current_energy = self.max_energy  # поточний рівень енергії
        self.is_active = False  # статус активності

    def do_activity(self):
        """
        Починає активність, якщо є достатньо енергії.

        :return: True, якщо активність можлива, False - якщо недостатньо енергії
        """
        if self.current_energy > self.max_energy * 0.2:  # потрібно мінімум 20% енергії
            print(f"{self.name} починає активність!")
            self.is_active = True
            self.current_energy -= self.max_energy * 0.2  # витрачається 20% енергії
            return True
        else:
            print(f"{self.name} не має достатньо енергії для активності")
            return False

    def rest(self):
        """
        Відпочиває, якщо була активність.

        :return: True, якщо відпочинок почався, False - якщо собака вже відпочиває
        """
        if self.is_active:
            print(f"{self.name} відпочиває")
            self.is_active = False
            return True
        return False

    def feed(self):
        """
        Годує собаку, відновлюючи частину енергії.
        """
        energy_gain = 30  # відновлення 30% енергії при годуванні
        self.current_energy = min(self.max_energy, self.current_energy + energy_gain)
        print(f"{self.name} поїв(ла)")

    def restore_energy(self):
        """
        Повністю відновлює енергію собаки.
        """
        self.current_energy = self.max_energy
        print(f"{self.name} повністю відновив(ла) енергію")

    def get_status(self):
        """
        Отримує поточний статус собаки.

        :return: Рядок із статусом активності та рівнем енергії
        """
        status = "активний(а)" if self.is_active else "відпочиває"
        return f"{self.name}: {status}, енергія: {self.current_energy}/{self.max_energy}"

