package project.jimmy.cookl.Cuisine;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by jim on 09/06/18.
 */

public class RecipeDB {
    private Set<Recipe> temporaryDB = new HashSet<>();

    public boolean addToDB(final Recipe recipe) {
        return temporaryDB.add(recipe);
    }

    public Set<Recipe> getDb() {
        return temporaryDB;
    }

    public Set<Recipe> getDBWithFilter(Predicate<Recipe> pred) {
        return temporaryDB.stream().filter(pred).collect(Collectors.toSet());
    }

    public boolean removeFromDB(final Recipe recipe) {
        return temporaryDB.remove(recipe);
    }


/*  TODO: copy a cuisine, save a short string to system buffer.
    public String encryptRecipe(final Recipe recipe) {
        return "not supported yet!";
    }

    public Recipe decryptRecipe(final String recipeString) {
        return
    }
*/
}
