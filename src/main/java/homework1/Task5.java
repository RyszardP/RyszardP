package homework1;

public class Task5 {
    public static void main(String[] args) {
        //  *5 задание
        // 5. Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)
        System.out.println();
        System.out.println("5 задание");
        for (int i = 0; i <= 15; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
