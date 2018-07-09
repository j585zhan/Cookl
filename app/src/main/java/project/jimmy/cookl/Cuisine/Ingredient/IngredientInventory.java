package project.jimmy.cookl.Cuisine.Ingredient;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import project.jimmy.cookl.Cuisine.Recipe;

/**
 * Created by jim on 09/06/18.
 */

public class IngredientInventory {
    private Set<IngredientProvider> inventory = new HashSet<>();
    private static IngredientInventory instance = new IngredientInventory();

    public static IngredientInventory getInstance() {
        return instance;
    }

    public void increaseInventory(String name, int quantity) {
        for (IngredientProvider provider : inventory) {
            if (provider.getName().equals(name)) {
                provider.increaseQuantity(quantity);
            }
        }
    }

    public void consumeInventory(Recipe recipe) {
        for (IngredientProvider provider : inventory) {
            for (IngredientConsumer consumer : recipe.getIngredients()) {
                provider.consume(consumer);
            }
        }
    }

    public boolean isConsumable(Set<IngredientConsumer> ingredients) {
        int counter = 0;
        for (IngredientConsumer consumer : ingredients) {
            for (IngredientProvider provider : inventory) {
                if (provider.isConsumable(consumer)) {
                    counter++;
                }
            }
        }
        return counter == ingredients.size();
    }

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
