package homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // * 1 задание
        // Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести равна 16%
        // от силы тяжести на Земле.
        System.out.println();
        System.out.println("1 task");
        Scanner s = new Scanner(System.in); // создание нового объекта класса сканер
        System.out.println("Введите свой вес"); // вывод текста на экран монитора
        double x = s.nextInt();
        System.out.println("Вы ввели " + x); // вывод  текста на экран монитора - вес
        double y = x * 0.16;
        System.out.println("Ваш вес на луне " + y); // вывод  текста на экран монитора - вес на Луне

    }
}
