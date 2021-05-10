package technology;

public class Program {
    public static void main(String[] args) {
        Laptop myLapTop = new Laptop(800,8,true,100);
        SmartPhone mySmartphone = new SmartPhone(128,4,true,0);

        mySmartphone.takeSelfie();
        System.out.println(myLapTop.needToPlugIn());
        System.out.println(mySmartphone.getNumberOfSelfies());

        mySmartphone.takeSelfie();
        System.out.println(mySmartphone.getNumberOfSelfies());

    }
}
