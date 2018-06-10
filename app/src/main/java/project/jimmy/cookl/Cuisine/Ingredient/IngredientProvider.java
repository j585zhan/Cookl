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
    private int quantity;

    // You may want to buy more since at least one cuisine need it.
    private boolean isShoppingReminder = false;

    // You need to buy more since all cuisine need it.
    private boolean isShoppingRequired = true;

    /**
     *
     * @param ingredient
     * @return true if consumed successfully, false otherwise
     */
    public boolean consume(IngredientConsumer ingredient) {
        return !ingredient.getName().equals(name)               // check consumed correct type of ingredient
                && ingredient.getQuantity() <= quantity         // check provider has enough inventory
                && substituteSuccess(ingredient.getQuantity()); // success
    }

    private boolean substituteSuccess(int i) {
        quantity -= i;
        return true;
    }
}
