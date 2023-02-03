package christmasDelivery;

import static christmasDelivery.SantasSleighImpl.arePresentsReady;

public class Elf {

    private final int index;

    public Elf(final int index) {
        this.index = index;
    }

    private Present requestPresent() {
        return ToyMachine.getInstance().createPresent();
    }

    private void packPresent(final Present present) {
        SantasSleighImpl.getInstance().pack(present);
    }

    public void requestAndPackPresent() {
        if (!arePresentsReady()) {
            System.out.printf("Elf %s started processing%n", index);
            final Present present = requestPresent();
            packPresent(present);
        }
    }
}
