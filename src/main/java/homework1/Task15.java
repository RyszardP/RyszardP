package homework1;

public class Task15 {
    public static void main(String[] args) {

        // * 15
        // Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе):
        //for
        //while
        //do while
        System.out.println();
        System.out.println("15 задание");
        //for
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //while
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }
        //do while
        int k = 0;
        do {
            k = k + 2;
            System.out.println(k);
        }
        while (k <= 99);
    }
}
