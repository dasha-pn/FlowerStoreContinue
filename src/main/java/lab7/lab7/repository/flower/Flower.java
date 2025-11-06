package lab7.lab7.repository.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower(Flower other) {
        this.sepalLength = other.sepalLength;
        this.color = other.color;
        this.price = other.price;
        this.flowerType = other.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public void setPrice(final double newPrice) {
        if (newPrice < 0) {
            throw new IllegalArgumentException("price must be >= 0");
        }
        this.price = newPrice;
    }

    public FlowerSpec getSpec() {
        return new FlowerSpec(flowerType, color, sepalLength);
    }
}
