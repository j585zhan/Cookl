package project.jimmy.cookl.Cuisine.Ingredient;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by jim on 09/06/18.
 */

public class IngredientInventory {
    private Set<IngredientProvider> inventory = new HashSet<>();

    public boolean addToInventory(final IngredientProvider ingredient) {
        return inventory.add(ingredient);
    }

    public Set<IngredientProvider> getInventory() {
        return inventory;
    }

    public Set<IngredientProvider> getInventoryWithFilter(Predicate<IngredientProvider> pred) {
        return inventory.stream().filter(pred).collect(Collectors.toSet());
    }

    public boolean removeFromInventory(final IngredientProvider ingredient) {
        return inventory.remove(ingredient);
    }

}
