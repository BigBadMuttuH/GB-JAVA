package a_lectures.IntelIDEA.Lec01;
// числа, символы, массивы, синтаксис.
// как запустить - просто из консоли
// java EX001_Syntax.java
// javac EX001_Syntax.java - скомпилировать файл.
// javap - c EX001_Syntax.class - распаковать (разкомпилировать) файл.
// jshell - интерпритатор командной строки java
// выйти из jshell - /ex


public class EX01_Syntax {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}

/*
Анатомия Java метода
Code Block (блок кода) {} - все что внутри скобок
Statement (оператор, предложение, инструкция)  System.out.println("Hello world!");
Expression (выражение)
    вызов метода                               System.out.println("Hello world!") - т.е. без ;
    квалификатор вызова метода                 System.out
    аргумент метода                            "Hello world!"
Declaration (объявление)
Expression List (список выражений)
Resource LIst (список ресурсов)
Statement List (список предложений)


Значения и их типы
Логические:     boolean;
Целочисленные:  byte, short, int, long;
Дробные:        float, double;
Символьные:     char;
Ссылочные:      Null, Object, .... heap - в ней храниться ссылка на какой-то объект

final int x = 5; - final - переменная ни когда не меняется
int x, y = 5; - так можно, но рекомендуется


Приоритет операций:


*/