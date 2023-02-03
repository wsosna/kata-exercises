package christmasDelivery;

import java.util.ArrayList;
import java.util.List;

public class SantasSleighImpl implements SantasSleigh {

    /**
     * To simplify we will use this parameter as amount of presents. Ideally we should receive as argument,
     * a detailed list of Presents and Addresses.
     */
    public static int AMOUNT_OF_PRESENTS_NEEDED = 10;

    private static SantasSleighImpl INSTANCE;
    private List<Present> presents;

    private SantasSleighImpl() {
        presents = new ArrayList<>();
    }

    public static SantasSleighImpl getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SantasSleighImpl();
        }
        return INSTANCE;
    }

    public static boolean arePresentsReady() {
        return SantasSleighImpl.getInstance().getAmountOfPresents() >= AMOUNT_OF_PRESENTS_NEEDED;
    }

    @Override
    public void pack(Present present) {
        presents.add(present);
        System.out.printf("Present packed! Current amount %s%n", getAmountOfPresents());
    }

    public int getAmountOfPresents() {
        return presents.size();
    }
}
