package homework2;

public class Task10 {
    public static void main(String[] args) {
        //Task 10. Write a Java program to find the maximum and minimum value of an array.
        int[] anArray;
        anArray = new int[10];
        System.out.println("Массив:");
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = ((int) (Math.random() * 100));

            System.out.println(anArray[i]);
        }
        // Вызов метода для максимального значения
        int max = getMax(anArray);
        System.out.println("максимум "+max);

        // Вызов метода минимального значения
        int min = getMin(anArray);
        System.out.println("минимум "+min);
    }

    // метод для максимального значения
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // метод для минимального значения
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}

