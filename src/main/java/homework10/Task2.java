
package homework10;
import java.util.HashSet;
import java.util.Set;

public class Task2 extends ObjectGenerator {

    // task 2
    static final int numberOfBooks = 10;
    private final static String[] vowels = {"А", "а", "Е", "е", "Ё", "ё", "И", "и", "О", "о", "У", "у", "Ы", "ы", "Э", "э", "Ю", "ю",};


    public void task2() {
        System.out.println("Task 2");

        Set<Books> hashSet = new HashSet<>();
        hashSet.add(ObjectGenerator.generator("Капитанская дочь", "Александр", "Пушкин", "Сергеевич", 1));
        hashSet.add(ObjectGenerator.generator("Крейсера", "Валентин", "Пикуль", "Саввич", 2));
        hashSet.add(ObjectGenerator.generator("Моонзунд", "Валентин", "Пикуль", "Саввич", 3));
        hashSet.add(ObjectGenerator.generator("Честь имею", "Валентин", "Пикуль", "Саввич", 4));
        hashSet.add(ObjectGenerator.generator("Баязет", "Валентин", "Пикуль", "Саввич", 5));

        System.out.println("HashSet list:  ");
        for (Books element : hashSet) {
            System.out.println(element);
        }
        System.out.println("HashSet list(starts with vowels):  ");
        for (Books element : hashSet) {
            for (String s : vowels) {
                if (element.getName().startsWith(s)) {
                    System.out.println(element);
                }
            }
        }

    }


}


