package homework2;

public class Task11 {
    public static void main(String[] args) {
        //Task 11. Write a Java program to reverse an array of integer values.

        int[] numbers;
        numbers = new int[10];
        System.out.println("Массив:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int) (Math.random() * 100));

            System.out.println(numbers[i]);
        }
            System.out.println("До:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
            System.out.println();
            System.out.println("После:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }


