package homework2;
public class Task15 {
    public static void main(String[] args) {

//Task 15. Write a Java program to find the common elements between two arrays of integers.

        int[] Array1 = {1, 4, 5, 2, 2,3};
        int[] Array2 = {6, 1, 8, 34, 5,3};

        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array2.length; j++) {
                if (Array1[i] == Array2[j]) {
                    System.out.println("общие элементы : " + Array1[i]);
                    break;
                }
            }
        }

    }

}
