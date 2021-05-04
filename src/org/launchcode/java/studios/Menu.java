package org.launchcode.java.studios;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdate;
    private ArrayList<MenuItem> menuItems;

    public Menu (Date aLastUpdate, ArrayList<MenuItem> aMenuItem){
        this.lastUpdate = aLastUpdate;
        this.menuItems = aMenuItem;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public ArrayList<MenuItem> addItems(MenuItem aMenuItem) {
        this.menuItems.add(aMenuItem);
        return this.menuItems;
    }
    public ArrayList<MenuItem> removeItems(MenuItem aMenuItem) {
        this.menuItems.remove(aMenuItem);
        return this.menuItems;
    }
    public void printItems(MenuItem aMenuItem) {
        System.out.println(aMenuItem.getPrice()+ ": " + aMenuItem.getDescription()+ ": "+ aMenuItem.getCategory() + ": " + aMenuItem.getNew());
    }
    public void printMenu(){
        for (MenuItem item: menuItems) {
            printItems(item);
        }

    }

}
