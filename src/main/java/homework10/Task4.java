package homework10;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    public void task4() {

        Set<Students> student = new TreeSet<>();
        student.add(ObjectGenerator.generator("Дима", "Иванов", 8));
        student.add(ObjectGenerator.generator("Влад", "Петров", 3));
        student.add(ObjectGenerator.generator("Алексей", "Сидоров", 7));
        student.add(ObjectGenerator.generator("Оля", "Кузнецова", 8));
        student.add(ObjectGenerator.generator("Константин", "Петухов", 5));
        student.add(ObjectGenerator.generator("Сергей", "Аваков", 6));

        LinkedList<Students> listForStudent = new LinkedList<>();
        listForStudent.addAll(student);
        for (Students st : listForStudent) {
            System.out.println(st);
        }
        System.out.println("after removing ");
        ListIterator<Students> liter  = listForStudent.listIterator();
        while (liter.hasNext()) {
            liter.next();
            if (liter.previousIndex() % 2 == 0 && liter.previousIndex() != -1) {
                System.out.println(liter.next());
            } else {
                liter.previous();
                liter.remove();
            }
        }
    }
}