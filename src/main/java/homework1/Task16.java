package homework1;

public class Task16 {
    public static void main(String[] args) {
        // * 16
        //Вывести на экран ряд натуральных чисел от минимума до максимума с шагом. Например, если минимум 10,
        // максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35. Минимум, максимум и шаг указываются
        // пользователем
        System.out.println();
        System.out.println("16 задание");
        int max16 = 720;
        int step16 = 32;
        for (int min16 = 0 ; min16 <= max16; min16  = min16  + step16) {
            System.out.println(min16);
        }
    }
}
