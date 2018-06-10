package project.jimmy.cookl.Cuisine;

import java.util.ArrayList;

import lombok.Builder;
import lombok.Getter;
import project.jimmy.cookl.Cuisine.Ingredient.IngredientConsumer;

/**
 * Created by jim on 09/06/18.
 */

@Getter
@Builder
public class Cuisine {
    private final boolean isBreakfast;
    private final boolean isLunch;
    private final boolean isDinner;

    private final String name;
    private final String description;
    private final ArrayList<IngredientConsumer> ingredients;
}
