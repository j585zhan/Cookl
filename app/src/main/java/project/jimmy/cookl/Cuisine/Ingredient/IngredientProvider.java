package project.jimmy.cookl.Cuisine.Ingredient;

import lombok.Builder;
import lombok.Getter;

/**
 * Created by jim on 09/06/18.
 */

@Getter
@Builder
public class IngredientProvider {
    private final String name;
    private final String unit;
    private final int limit;
    private int quantity;

    private boolean isShoppingRequired() {
        return quantity <= limit;
    }

    public boolean isConsumable(IngredientConsumer consumer) {
        return consumer.getName().equals(name) && consumer.getQuantity() <= quantity;
    }

    /**
     *
     * @param consumer
     * @return true if consumed successfully, false otherwise
     */
    public void consume(IngredientConsumer consumer) {
        if (isConsumable(consumer)) {
            quantity -= consumer.getQuantity();
        }
    }

    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }
}
