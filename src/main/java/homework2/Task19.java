package homework2;
import java.util.Arrays;
import java.util.Random;

public class Task19 {
    public static void main(String[] args) {
        //Task 19. Write a Java program to add two matrices of the same size.
        int rowsCount = 5;
        int columnsCount = 10;

        int[][] matrice1 = new int[rowsCount][columnsCount];
        int[][] matrice2 = new int[rowsCount][columnsCount];



        Random random = new Random();

        for (int i = 0; i < rowsCount; i++) {
            for (int a = 0; a < columnsCount; a++) {
                matrice1[i][a] = random.nextInt(100);
                matrice2[i][a] = random.nextInt(100);
            }
        }

        System.out.println("Matrice #1:\r\n");
        for (int i = 0; i < rowsCount; i++) {
            System.out.println(Arrays.toString(matrice1[i]));
        }

        System.out.println("\r\nMatrice #2:\r\n");
        for (int i = 0; i < rowsCount; i++) {
            System.out.println(Arrays.toString(matrice2[i]));
        }

        System.out.println();
    }
    }


