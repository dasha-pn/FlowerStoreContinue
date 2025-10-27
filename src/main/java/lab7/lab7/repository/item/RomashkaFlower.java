package lab7.lab7.repository.item;

public class RomashkaFlower extends Item {
    private final double cost;

    public RomashkaFlower(double cost) {
        this.description = "RomashkaFlower";
        this.cost = cost;
    }

    @Override
    public double price() {
        return cost;
    }
}
