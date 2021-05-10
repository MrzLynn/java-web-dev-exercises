package technology;

public class Computer extends AbstractEntity{
    private int ram;
    private int storage;
    private boolean hasScreen;

    public Computer (Integer ram, Integer storage, Boolean hasScreen) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.hasScreen = hasScreen;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isHasScreen() {
        return hasScreen;
    }

    public void setHasScreen(boolean hasScreen) {
        this.hasScreen = hasScreen;
    }
    public void increaseRam(int number) {
        this.ram = this.ram + number;
    }
    public void increaseStorage(int number) {
        this.storage = this.storage + number;
    }
}


