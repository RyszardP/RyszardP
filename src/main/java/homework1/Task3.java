package homework1;

public class Task3 {
    public static void main(String[] args) {
        // * 3 задание
        // Напишите метод, который будет проверять является ли число палиндромом
        // (одинаково читающееся в обоих направлениях).
        System.out.println();
        System.out.println("3 задание");
        int[] a3 = {1, 2, 3, 4, 3, 2, 1};
        boolean t = true;
        for (int i = 0; i < a3.length; i++)
            if (a3[i] != a3[a3.length - i - 1]) t = false;
        System.out.println(t ? "Это полиндром " : " Это не полиндром");
    }

}
