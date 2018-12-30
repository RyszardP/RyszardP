package homework2;
public class Task7 {

    public static void main(String[] args) {

        //Task 7.  Write a Java program to remove a specific element from an array.

        int[] anArray;
        int[] newArray;
        newArray = new int[10];
        anArray = new int[10];
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        int i = 0;
        int x = 0;
        while (i < anArray.length) {
            if (anArray[i] == 300) i++;

            {
                newArray[x] = anArray[i];
                i++;
                x++;

            }
            System.out.println(newArray[x]);
        }
    }

}
