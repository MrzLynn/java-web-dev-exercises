package technology;

public class SmartPhone extends Computer {
    private int numberOfSelfies;

    public SmartPhone(Integer ram, Integer storage, Boolean hasScreen, Integer numberOfSelfies) {
        super(ram, storage, hasScreen);
        this.numberOfSelfies = numberOfSelfies;
    }

    public int getNumberOfSelfies() {
        return numberOfSelfies;
    }

    public void setNumberOfSelfies(int numberOfSelfies) {
        this.numberOfSelfies = numberOfSelfies;
    }

    public void takeSelfie () {
        this.numberOfSelfies = this.numberOfSelfies + 1;
    }
}
