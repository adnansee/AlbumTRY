import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity


public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ElementCollection
    private Collection<Ingredients> ingredients = new ArrayList<>();

    public Menu() {
    }

    public Menu(Collection<Ingredients> dishes) {
        this.ingredients = dishes;
    }

    public int getId() {
        return id;
    }

    public Menu setId(int id) {
        this.id = id;
        return this;
    }

    public Collection<Ingredients> getIngredients() {
        return ingredients;
    }

    public Menu setIngredients(Collection<Ingredients> ingredients) {
        this.ingredients = ingredients;
        return this;
    }
}
