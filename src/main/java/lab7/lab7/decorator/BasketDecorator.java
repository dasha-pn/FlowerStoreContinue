package lab7.lab7.decorator;

import lab7.lab7.repository.item.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
        this.description = "BasketDecorator";
    }

    @Override
    public double price() {
        return item.price() + 4;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + basket";
    }
}
