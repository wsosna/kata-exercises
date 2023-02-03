package christmasDelivery;

public class ToyMachine {

    private static ToyMachine INSTANCE;

    private ToyMachine() {}

    public static ToyMachine getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ToyMachine();
        }
        return INSTANCE;
    }

    public Present createPresent() {
        try {
            System.out.println("Creating present...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Present created!");
        return new Present(this);
    }
}
