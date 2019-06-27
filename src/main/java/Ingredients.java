import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Embeddable
public class Ingredients {
    private int quantity;
    private String name;

    public Ingredients() {
    }

    public int getQuantity() {
        return quantity;
    }

    public Ingredients setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getName() {
        return name;
    }

    public Ingredients(int quantity, String name) {
        this.quantity = quantity;
        this.name = name;
    }

    public Ingredients setName(String name) {
        this.name = name;
        return this;
    }
}
