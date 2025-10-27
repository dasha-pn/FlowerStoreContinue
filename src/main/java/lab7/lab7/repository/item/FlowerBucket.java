package lab7.lab7.repository.item;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private final List<Item> items = new ArrayList<>();

    public FlowerBucket() {
        this.description = "FlowerBucket";
    }

    public void addFlowers(Item it) { items.add(it); }

    public Item searchFlower(Class<? extends Item> cls) {
        return items.stream().filter(cls::isInstance).findFirst().orElse(null);
    }

    @Override
    public double price() {
        return items.stream().mapToDouble(Item::price).sum();
    }
}
