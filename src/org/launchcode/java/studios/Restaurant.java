package org.launchcode.java.studios;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem fries = new MenuItem(3, "crispy crinkly","side", false);
        MenuItem chickenStrips = new MenuItem(12, "grilled or crunchy","side", true);
        MenuItem cake = new MenuItem(30, "freshly baked","side", false);
        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItem> collectionOfMenuItems = new ArrayList<>();
        collectionOfMenuItems.add(fries);
        collectionOfMenuItems.add(chickenStrips);
        collectionOfMenuItems.add(cake);
        collectionOfMenuItems.remove(fries);
        Menu sideMenu = new Menu(today, collectionOfMenuItems);
        sideMenu.addItems(fries);
        sideMenu.removeItems(fries);
        //sideMenu.printItems(cake);
        //sideMenu.printItems(chickenStrips);
        sideMenu.printMenu();



    }
}
