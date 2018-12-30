package homework1;

public class Task4 {
    public static void main(String[] args) {
        // * 4 задание
        // Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)

        System.out.println("4 задание");
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
