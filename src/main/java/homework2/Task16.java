package homework2;

import java.util.ArrayList;

public class Task16 {
    public static void main(String[] args) {
        // Task 16.Write a Java program to remove duplicate elements from an array.

        int[] a = {1, 5, 1, 2, 4, 3, 5, 10, 3, 6, 2, 9, 12, 4};

        ArrayList<Integer> duplicateIndexList = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {

            if (!duplicateIndexList.contains(i)) {
                boolean isExistDuplicatenValue = false;

                for (int j = i + 1; j < a.length; j++) {

                    if (a[i] == a[j]) {
                        duplicateIndexList.add(j);
                        isExistDuplicatenValue = true;
                    }
                }
                if (isExistDuplicatenValue)
                    duplicateIndexList.add(i);
            }
        }
        int[] aNumberResult = new int[a.length - duplicateIndexList.size()];

        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (!duplicateIndexList.contains(i)) {
                aNumberResult[index] = a[i];
                index++;
            }
        }

        System.out.println(aNumberResult);
    }


}
