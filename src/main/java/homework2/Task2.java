package homework2;

public class Task2 {
    public static void main(String[] args) {

        //Task 2. Write a Java program to sum values of an array.
        int[] anArray;
        anArray = new int[10];
        System.out.println("Массив:");
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = ((int) (Math.random() * 100));

            System.out.println(anArray[i]);
        }


            int sum = 0;
            for (int i = 0; i < anArray.length; i++) {
                i = i++;
            }
            for (int i = 0; i < anArray.length; i++) {
                sum += anArray[i];
            }
        System.out.println("Сумма массива:");
            System.out.println(sum);
        }
    }

