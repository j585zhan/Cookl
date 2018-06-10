package project.jimmy.cookl.Cuisine;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by jim on 09/06/18.
 */

public class CuisineDB {
    private Set<Cuisine> temporaryDB = new HashSet<>();

    public boolean addToDB(final Cuisine cuisine) {
        return temporaryDB.add(cuisine);
    }

    public Set<Cuisine> getDb() {
        return temporaryDB;
    }

    public Set<Cuisine> getDBWithFilter(Predicate<Cuisine> pred) {
        return temporaryDB.stream().filter(pred).collect(Collectors.toSet());
    }

    public boolean removeFromDB(final Cuisine cuisine) {
        return temporaryDB.remove(cuisine);
    }


/*  TODO: copy a cuisine, save a short string to system buffer.
    public String encryptCuisine(final Cuisine cuisine) {
        return "not supported yet!";
    }

    public Cuisine decryptCusion(final String cuisineString) {
        return
    }
*/
}
