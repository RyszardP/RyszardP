package homework2;

public class Task1 {
    public static void main(String[] args) {

        //Task 1. Write a Java program to sort a numeric array and a string array.
        int [] anArray;
        anArray = new int[10];
        System.out.println("Массив:");
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = ((int) (Math.random() * 100));

            System.out.println(anArray[i]);
        }
        System.out.println("Отсортированный по убыванию массив:");
        for (int i = 0; i < anArray.length; i++) {
            int m = i;
            for (int j = i; j < anArray.length; j++) {
                if (anArray[m] < anArray[j])
                    m = j;
            }
            int t = anArray[m];
            anArray[m] = anArray[i];
            anArray[i] = t;
            System.out.println(anArray[i]);
        }

        String arrayW[] = {"AA", "BB", "ABA", "BBA", "BBB", "BAB", "AAAA", "AAABA", "ABABA", "BBBAB", "A",
                "B"};
        {
            for (int j = 0; j < arrayW.length; j++) {
                for (int i = j + 1; i < arrayW.length; i++) {
                    if (arrayW[i].compareTo(arrayW[j]) < 0) {
                        String k = arrayW[j];
                        arrayW[j] = arrayW[i];
                        arrayW[i] = k;
                    }
                }
                System.out.println(arrayW[j]);
            }
        }

    }
}
