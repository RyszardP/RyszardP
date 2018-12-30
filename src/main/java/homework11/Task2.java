package homework11;
import java.io.*;
import java.util.*;

public class Task2 {

    static int select;
    final static int countOfnumbers = 20;

    public static void main(String[] args) throws IOException {
        ArrayList arrayOfNumbers = new ArrayList();
        Random rand = new Random();
        for (int j = 0; j < countOfnumbers; j++) {
            select = rand.nextInt(100);
            arrayOfNumbers.add(select);
        }

        System.out.println(arrayOfNumbers); // unsorted array list

        Collections.sort(arrayOfNumbers);
        System.out.println("Sorted array:");
        System.out.println(arrayOfNumbers); // sorted array list
// create txt file
        File file = new File("arrayTask2.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < arrayOfNumbers.size(); i++) {
            bw.write(arrayOfNumbers.get(i).toString() + " ");
        }
        bw.flush();
        bw.close();
        System.out.println("file is done:");
    }
}



