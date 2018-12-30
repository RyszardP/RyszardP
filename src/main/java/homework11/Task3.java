package homework11;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fInputStream = new FileInputStream("textfile.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fInputStream));

        String strLine; //
        String tmp; //

//Read File Line By Line
        while ((strLine = br.readLine()) != null) {
            // Print the content on the console

            String[] words = strLine.split(" "); // divide String into words (the separator will be a space)
            tmp = words[0];
            words[0] = words[words.length-1];
            words[words.length-1] = tmp;
            for (String word : words) {
                System.out.print(word + " ");
            }
            // System.out.println(strLine);
        }

//Close the input stream
        br.close();
    }
}







