package homework2;
public class Task5 {

    public static void main(String[] args) {
        //Task 5.  Write a Java program to test if an array contains a specific value.
        int[] anArray;
        anArray = new int[10];
        System.out.println("Массив:");
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = ((int) (Math.random() * 100));

            System.out.println(anArray[i]);
        }
            int toFind = 3;
            boolean found = false;

            for (int n : anArray) {
                if (n == toFind) {
                    found = true;
                    break;
                }
            }

            if (found)
                System.out.println(toFind + " Найдено .");
            else
                System.out.println(toFind + " Не найдено");
        }
    }


