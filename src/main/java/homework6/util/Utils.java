package homework6.util;



import homework6.domain.Appliances;
import homework6.domain.FridgerF;
import homework6.domain.FreezerVolume;
import homework6.domain.FridgeVolume;

import java.util.ArrayList;


public class Utils {
    public static ArrayList<FridgerF> listFridgef() {

        ArrayList<FridgerF> fr = new ArrayList<>();
        fr.add(new FridgerF("A", 4522, 250, FridgeVolume.MFridge, FreezerVolume.SFreezer));
        fr.add(new FridgerF("A+", 2100, 210, FridgeVolume.SFridge, FreezerVolume.MFreezer));
        fr.add(new FridgerF("A+", 4100, 240, FridgeVolume.SFridge, FreezerVolume.MFreezer));
        fr.add(new FridgerF("A", 2500, 290, FridgeVolume.LFridge, FreezerVolume.LFreezer));

        return fr;
    }

    public static void setNewPrise(ArrayList<FridgerF> fr, double prc) {
        for (int i = 0; i < fr.size(); i++) {
            if (fr.get(i).getVolume() > 220)
                fr.get(i).setPrice(prc);
        }
        fr.forEach(System.out::println);
        System.out.println();
    }


}
