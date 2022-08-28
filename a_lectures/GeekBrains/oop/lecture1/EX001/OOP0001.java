/*
Реализация только после абстракций
Абстракция - что делает?
Поведение - как делает?
Спецификация - набор правил, описывающих API.

Класс - это "чертеж" (описание) сущности предметной области,
позволяющий выделить некоторые общие характеристики, состояние
и поведение, зависящее от состояния.

Предметная область - множество всех предметов (явлений) решаемой проблемы.

Экземпляр класса - отдельный представитель класса, имеющий КОНКРЕТНОЕ состояние
и поведение, которое полностью определяется описанием класса.

    - Состояние - набор данных (полей, атрибутов членов класса).
            Поля, константы, события.
    - Поведение - функции для работы с данными и выполнения полезной работы.
            Конструкторы, метод...

ООП - объектно-ориентированное программирование.
Парадигма (стиль, шаблон) разработки ПО, основными понятиями которой являются классы и объекты.
Говорят, что разработка в стиле ООП ведется с использованием классов объектов, которые
обладают состоянием и поведением, зависящим от этого состояния.


-! Инкапсуляция - это свойство системы, позволяющее объединить данные и методы, работающие
с ними в классе, скрыв детали реализации и защитив от пользователя этого класса объектов.

-! Наследование - это свойство системы, позволяющее описать новый класс на основе уже существующего,
с частичной или полностью заимствующейся функциональностью.
Класс, от которого производится наследование, называется базовым или родительским.
Новый класс - потомком, наследником или производным классом.

-! Полиморфизм - это свойство системы, использовать объекты с одинаковым интерфейсом без
информации о типе и внутренней структуре.
Полиморфизм - способность использовать объект вне зависимости от его реализации, благодаря,
полиморфной переменной - это переменная, которая может принимать значения разных типов.

-! Абстракция -

_ переиспользование кода
_ отправка сообщений

*/
package a_lectures.GeekBrains.oop.lecture1.EX001;

public class OOP0001 {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {

        int ax = 0;
        int ay = 0;
        int bx = 0;
        int by = 1;
        System.out.println((distance(ax, ay, bx, by)));
    }
}
