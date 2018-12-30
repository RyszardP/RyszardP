package homework2;
import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        //Task 17. Write a Java program to find the second largest element in an array.
        {
            int[] numbers;
            numbers = new int[10];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = ((int) (Math.random() * 100));


            }

            Arrays.sort(numbers);
            System.out.println("отсортированный массив: " + Arrays.toString(numbers));
            int res = numbers[numbers.length - 2];
            System.out.println("второй по величине элемент: " + res);
        }
    }
}
