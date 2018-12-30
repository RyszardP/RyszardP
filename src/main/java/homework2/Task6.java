package homework2;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        //Task 6.  Write a Java program to find the index of an array element.
        double[] anArray = {13, 7.6, 9.5, 10.5};
        double searchValue = 9.5;
        int indexValue = 0;

        for (int i = 0; i < anArray.length; i++) {

            if (anArray[i] == searchValue) {
                indexValue = i;
                break;
            }
        }
        System.out.println(String.format("Array: -> %s, index %s ? -> %s%n",
                Arrays.toString(anArray), searchValue, indexValue));
        System.out.println("масиив");
        System.out.println(String.format(Arrays.toString(anArray)));

        System.out.println(searchValue  + " " + indexValue);
    }

}
