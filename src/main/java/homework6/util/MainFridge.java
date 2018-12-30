package homework6.util;

import homework6.domain.FridgerF;

import java.util.ArrayList;

public class MainFridge {
    public static void main(String[] args) {
        ArrayList<FridgerF> fr = Utils.listFridgef();
        Utils.setNewPrise(fr,FridgerF.newPrice);


    }
}