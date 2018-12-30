package homework2;
public class Task8 {
    public static void main(String[] args) {
        //Task 8.  Write a Java program to copy an array by iterating the array
        int a[] = {1, 8, 3};

        int b[] = new int[a.length];

        b = a;

        b[0]++;

        System.out.println("массив a[] ");
        for (int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("\n\nмассив b[] ");
        for (int i=0; i<b.length; i++)
            System.out.print(b[i] + " ");
    }

}
