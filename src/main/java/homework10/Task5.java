package homework10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Task5 {
    public void task5() {

        System.out.println();
        System.out.println("Task 5");
        HashMap<String, Integer> electronics = new HashMap<>();
        electronics.put("Woodworking machinery", 493);
        electronics.put("Metalworking Machines", 305);
        electronics.put("Tile Cutting Machines", 122);
        electronics.put("Sharpening machines (sharpening)", 243);


        //sort for hashMap collection
        List<Map.Entry<String, Integer>> list = new ArrayList<>(electronics.entrySet());
        Collections.sort(list, new ComparatorByValueMap());
        System.out.println();
        for (Map.Entry<String, Integer> lh : list) {
            System.out.println(lh.getKey() + ": " + lh.getValue() + " units");
        }

        //deleting all category with zero units of goods
        System.out.println();
        System.out.println("After deleting category with zero units of goods");
        Iterator<Map.Entry<String, Integer>> irr = list.iterator();
        while (irr.hasNext()) {
            Map.Entry entryMap = irr.next();
            if (entryMap.getValue().equals(new Integer(0)))
                irr.remove();
        }
        for (Map.Entry<String, Integer> lh : list) {
            System.out.println(lh.getKey() + ": " + lh.getValue() + " units");
        }
    }
}

