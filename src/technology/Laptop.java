package technology;

public class Laptop extends Computer {
    private int batteryLife;


    public Laptop(Integer ram, Integer storage, Boolean hasScreen, Integer batteryLife) {
        super(ram, storage, hasScreen);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean needToPlugIn() {
        if (batteryLife <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
