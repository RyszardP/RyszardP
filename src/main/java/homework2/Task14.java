package homework2;
import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        // Write a Java program to find the common elements between two arrays (string values).
        String[] arr1 = {"1", "9", "1", "8", "5", "1", "2", "4", "6"};
        String[] arr2 = {"7", "2", "3", "3", "3", "3", "3", "3", "7"};

        System.out.println("Массив1 : " + Arrays.toString(arr1));
        System.out.println("Массив2 : " + Arrays.toString(arr2));

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == (arr2[j])) {
                    System.out.println("общие элементы : " + (arr1[i]));
                }
            }
        }
    }
}

