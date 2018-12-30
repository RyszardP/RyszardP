package homework2;
import java.util.Arrays;


public class Task12 {
    public static void main(String[] args) {
        //Task 12. Write a Java program to find the duplicate values of an array of integer values.
        //int [] array = new int[20];

        int[] array;
        array = new int[10];
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));


        }

        int element = 5; // искомое число
        int count = 0; // количество


        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]++;
            if (array[i] == element)
                count++;

        }
        System.out.println( "В массиве " + Arrays.toString(array));
        System.out.println("значение " + element + " содержится " + count + " раз(а) ");
    }
}
