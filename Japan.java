public class Japan implements Locations {

    int airFare = 15000;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}