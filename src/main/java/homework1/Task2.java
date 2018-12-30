package homework1;

public class Task2 {
    public static void main(String[] args) {

    // * 2 задание
    // Напишите метод, который будет увеличивать каждый элемент массива на 10%.
    System.out.println();
    System.out.println("2 задание");
    double percent = 10;
    double[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8}; // задание массива
    for (int i = 0; i < numbers1.length; i++) {
        System.out.println(numbers1[i] + (numbers1[i] * percent * 0.01)); //вывод массива + 10%
        }
    }
}
