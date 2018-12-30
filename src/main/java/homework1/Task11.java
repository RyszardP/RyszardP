package homework1;
public class Task11 {
    public static void main(String[] args) {

// * 11 Задание
        // 11. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.
        System.out.println();
        System.out.println("11 задание");

        int X = 9;
        int Y = 7;
        int Z = 6;
        int max = 0;
        if (X > Y) {
            if (X > Z) {
                max = X;
                System.out.println(max);
            } else {
                max = Z;
                System.out.println(max);
            }
        } else {
            max = Y;
            System.out.println(max);
        }
    }
}
