package homework2;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        //Task 9.  Write a Java program to insert an element (specific position) into an array.

        int array[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array) + " Исходный массив");

        int pos = 3; // вставляемое место
        int x = 5; // вставляемое число

        for(int i = (array.length-1); i >= (pos-1); i--)

            array[pos-1] = x;
        System.out.println(Arrays.toString(array) + " После вставки");
        for(int i = 0; i < array.length; i++);

    }
}
