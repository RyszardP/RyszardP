package homework10;

import java.util.*;

public class Task3 {
    public void task3() {

        Set<Books> hashBook = new HashSet<>();
        hashBook.add(ObjectGenerator.generator("Капитанская дочь", "Александр", "Пушкин", "Сергеевич", 1));
        hashBook.add(ObjectGenerator.generator("Крейсера", "Валентин", "Пикуль", "Саввич", 2));
        hashBook.add(ObjectGenerator.generator("Моонзунд", "Валентин", "Пикуль", "Саввич", 3));
        hashBook.add(ObjectGenerator.generator("Честь имею", "Валентин", "Пикуль", "Саввич", 4));
        hashBook.add(ObjectGenerator.generator("Баязет", "Валентин", "Пикуль", "Саввич", 5));



        //Task 3
        // Sort for writers name using treeSet and method compareTo from Books class
        System.out.println();
        System.out.println("Task 3");
        System.out.println("Sort by writers name");
        Set<Books> treeSetForHash = new TreeSet<>(BookComparator.authorNameComparator);
        treeSetForHash.addAll(hashBook);
        for (Books elements : treeSetForHash) {
            System.out.println(elements);
        }
        System.out.println();

        //Sort for writers surname using List and method compare to from Book class
        System.out.println("Sort by author surname");
        List<Books> linkedForHash = new LinkedList<>();
        linkedForHash.addAll(hashBook);
        Collections.sort(linkedForHash, BookComparator.authorSurnameComparator);
        for (Books bk : linkedForHash) {
            System.out.println(bk);
        }

        //sort for patronymics
        System.out.println("sort by author father name");
        Collections.sort(linkedForHash, BookComparator.authorFatherNameComparator);
        for (Books bk : linkedForHash) {
            System.out.println(bk);
        }
    }
}