public class Philippines implements Locations {

    int airFare = 5000;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}