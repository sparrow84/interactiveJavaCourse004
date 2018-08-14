/*
    Worker
    1. Создать класс «Сотрудник» с полями: ФИО, должность, email, телефон, зарплата, возраст;

    Worker
    2. Конструктор класса должен заполнять эти поля при создании объекта;

    Worker
    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;

    Main
    4. Создать массив из 5 сотрудников:
        Пример:
            Person[] persArray = new Person[5];
            // Вначале объявляем массив объектов
            persArray[0] = new Person("Ivanov Ivan", "Engineer", " ivivan@mailbox.com ", "892312312", 30000, 30);
            // потом для каждой ячейки массива задаем объект
            persArray[1] = new Person(...); ... persArray[4] = new Person(...);
            С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

    6. Создать классы Собака и Кот с наследованием от класса Животное;

    7. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
        В качестве параметра каждому методу передается величина, означающая или длину препятствия
        (для бега и плавания), или высоту (для прыжков);

    8. У каждого животного есть ограничения на действия
        (бег: кот – 200 м., собака – 500 м.;
        прыжок: кот – 2 м., собака – 0.5 м.;
        плавание: кот не умеет плавать, собака – 10 м.);

    9. При попытке животного выполнить одно из этих действий,
        оно должно сообщить результат в консоль.
        (Например, dog1.run(150); -> результат: run: true);

    10. Добавить животным разброс в ограничениях.
        То есть у одной собаки ограничение на бег может быть 400 м., у другой – 600 м.
 */


package com.company;

public class Main {

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];

        cat[0] = new Cat("Васька");
        cat[1] = new Cat("Рыжик");
        cat[2] = new Cat("Снежок");

        Bowl bowl = new Bowl();
        boolean res;

        do {
            res = false;
            for (Cat kitty : cat) {
                if (!kitty.eat(bowl)) {
                    res = true;
                    bowl.fillBowl();
                }
            }
        } while (res);

        boolean result;


    }
}

