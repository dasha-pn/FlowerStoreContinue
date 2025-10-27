package lab7.lab7.decorator;

import lab7.lab7.repository.item.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
        this.description = "RibbonDecorator";
    }

    @Override
    public double price() {
        return item.price() + 40;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + ribbon";
    }
}
