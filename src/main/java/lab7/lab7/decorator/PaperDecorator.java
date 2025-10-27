package lab7.lab7.decorator;

import lab7.lab7.repository.item.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
        this.description = "PaperDecorator";
    }

    @Override
    public double price() {
        return item.price() + 13;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + paper";
    }
}
