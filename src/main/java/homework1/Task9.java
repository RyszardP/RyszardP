package homework1;

public class Task9 {
    public static void main(String[] args) {

        // * 9 задание
        //  9 Объявить 2 переменных целого типа. Необходимо поменять значения переменных так,
        // чтобы значение первой оказалось во второй, а второй - в первой.
        System.out.println();
        System.out.println("9 задание");
        int number91 = 2;
        int number92 = 4;

        System.out.println(number91 + " " + number92);

        int number93 = number91;
        number91 = number92;
        number92 = number93;

        System.out.println(number91 + " " + number93);
    }
}
