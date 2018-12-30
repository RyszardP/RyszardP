package homework2;
public class Task4 {
    public static void main(String[] args){

        //Task 4.  Write a Java program to calculate the average value of array elements.

        int[] anArray;
        anArray = new int[10];
        System.out.println("Массив:");
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = ((int) (Math.random() * 100));

            System.out.println(anArray[i]);
        }

        int sum = 0;
        int average;
        for (int i = 0; i < anArray.length; i++) {
            i = i++;
        }
        for (int i = 0; i < anArray.length; i++) {
            sum += anArray[i];
        }
        average = (int)sum / anArray.length;
        System.out.println("Среднее значение массива:");
        System.out.println(average);
    }
}
