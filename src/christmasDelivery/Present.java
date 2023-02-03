package christmasDelivery;

public class Present {

    private final ToyMachine createdBy;

    public Present(final ToyMachine creator) {
        this.createdBy = creator;
    }

    public ToyMachine getCreatedBy() {
        return createdBy;
    }
}
