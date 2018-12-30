package homework2;


public class Task13 {
    public static void main(String[] args) {
        //Task 13. Write a Java program to find the duplicate values of an array of string values.

        String[] array = {"AAA", "BBB", "ABA", "ABB", "AAA", "ABB", "ABB"};


        for (
                int i = 0;
                i < array.length - 1; i++)
        {
            for (int j = i + 1; j < array.length; j++) {

                if ((array[i].equals(array[j])) && (i != j)) {
                    System.out.println("Дублирующийся элемент " + array[j]);
                }
            }
        }
    }
}