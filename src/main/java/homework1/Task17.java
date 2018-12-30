package homework1;

public class Task17 {
    public static void main(String[] args) {

        // * 17
        // Все элементы массива поделить на значение наибольшего элемента этого массива.
        System.out.println();
        System.out.println("17 задание");
        double numbers[] = {3,5,4,8,9,2,10,2};
        int f;
        double m = numbers[0];
        for(f=0;f<numbers.length;f++)
        {
            if(m < numbers[f])
                m = numbers[f]; // находим максимальное число
        }
        System.out.println("максимальное число =" + m);
        for (int j = 0; j < numbers.length; j++) {
            if(numbers[j] <= m){
                numbers[j] = numbers[j] / m; // делим элементы массива на число
                System.out.print(numbers[j] + ", ");
            }
        }
    }
}
