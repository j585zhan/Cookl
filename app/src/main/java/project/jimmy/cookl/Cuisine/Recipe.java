package project.jimmy.cookl.Cuisine;

import java.util.Set;

import lombok.Builder;
import lombok.Getter;
import project.jimmy.cookl.Cuisine.Ingredient.IngredientConsumer;
import project.jimmy.cookl.Cuisine.Ingredient.IngredientInventory;

/**
 * Created by jim on 09/06/18.
 */

@Getter
@Builder
public class Recipe {
    private final boolean isBreakfast;
    private final boolean isLunch;
    private final boolean isDinner;

    private final String name;
    private final String description;
    private final Set<IngredientConsumer> ingredients;

    public boolean isAvailable() {
        return IngredientInventory.getInstance().isConsumable(ingredients);
    }
}
