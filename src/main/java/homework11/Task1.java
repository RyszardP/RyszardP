package homework11;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\JavaClassForReading.java");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st.replace("public", "private"));

        }

    }
}
