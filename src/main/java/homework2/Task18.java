package homework2;
import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        //Task 18. Write a Java program to find the second smallest element in an array.
        {
            int[] array;
            array = new int[10];

            for (int i = 0; i < array.length; i++) {
                array[i] = ((int) (Math.random() * 100));


            }

            Arrays.sort(array);
            System.out.println("отсортированный массив :"+Arrays.toString(array));
            int res = array[1];
            System.out.println("второе наменьшее значение:"+res);


        }

    }
}
