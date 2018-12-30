package homework1;

public class Task14 {
    public static void main(String[] args) {

        // * 14 Создайте программу с двумя переменными целого типа, присвойте им значения, если первая переменная
        // больше второй, то увеличьте её значение на 3, иначе увеличьте значение второй переменной на 8. В конце
        // программы выведите значения обоих чисел на экран.
        System.out.println();
        System.out.println("14 задание");

        int int141 = 5;
        int int142 = 4;
        if (int141 > int142) {
            System.out.println(int141 * 3);
            System.out.println(int142);
        } else {
            System.out.println(int141);
            System.out.println(int142 * 8);
        }
    }
}
