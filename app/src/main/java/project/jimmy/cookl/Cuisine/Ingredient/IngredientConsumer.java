package project.jimmy.cookl.Cuisine.Ingredient;

import lombok.Builder;
import lombok.Getter;

/**
 * Created by jim on 09/06/18.
 */

@Getter
@Builder
public class IngredientConsumer {
    public String name;
    public String unit;
    public int quantity;
}
