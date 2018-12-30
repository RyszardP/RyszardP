package homework10;

import java.util.LinkedList;

import static homework10.ObjectGenerator.randomWords;


public class Task1 {
    public static void task1() {

        System.out.println("Task 1");

        LinkedList<Books> bookList = new LinkedList<>();
        bookList.add(ObjectGenerator.generator("Капитанская дочь", "Александр", "Пушкин", "Сергеевич", 1));
        bookList.add(ObjectGenerator.generator("Крейсера", "Валентин", "Пикуль", "Саввич", 2));
        bookList.add(ObjectGenerator.generator("Баязет", "Валентин", "Пикуль", "Саввич", 3));

        System.out.println(bookList);
        bookList.remove(1);//delete second book
        System.out.println("Book list after removal");
        System.out.println(bookList);


        System.out.println("All books:  ");
        for (Books element : bookList) {
            System.out.println(element);
        }
        bookList.remove(1);
        System.out.println("after deleting:  ");
        for (Books element : bookList) {
            System.out.println(element);
        }
    }
}