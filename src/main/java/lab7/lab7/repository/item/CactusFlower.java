package lab7.lab7.repository.item;

public class CactusFlower extends Item {
    private final double cost;

    public CactusFlower(double cost) {
        this.description = "CactusFlower";
        this.cost = cost;
    }

    @Override
    public double price() {
        return cost;
    }
}
